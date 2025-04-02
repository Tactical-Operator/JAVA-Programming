def min_borrow_amount(N, EarnArray, CostArray):
    # Create a list of (earnings, costs) and sort by costs
    books = sorted(zip(EarnArray, CostArray), key=lambda x: x[1])
    
    current_savings = 0
    total_borrowed = 0
    
    for earning, cost in books:
        current_savings += earning
        if current_savings < cost:
            # Not enough money, need to borrow
            total_borrowed += (cost - current_savings)
            current_savings = 0  # After borrowing, savings are effectively zero for this book
        else:
            # Enough money, just deduct the cost
            current_savings -= cost
    
    return total_borrowed

# Example usage
N = 3
EarnArray = [3, 2, 5]
CostArray = [7, 4, 2]

print(min_borrow_amount(N, EarnArray, CostArray))