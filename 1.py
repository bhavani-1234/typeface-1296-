def ternary(q):
    b = q//3
    h = q%3
    if q == 0:
        return '0'
    elif b == 0:
        return int(str(h))
    else:
        return ternary(b) + int(str(h))
