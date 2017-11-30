public class GameofLife
{
    int[][] box;
    int[][] box2;
    private int rows;
    private int columns;
    private int check;
    
    public GameofLife(int height, int width)
    {
        rows = height;
        columns = width;
        box = new int[rows][columns]; 
        box2 = new int[rows][columns]; 
    }
    
    public void buildRandomBoard()
    {
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                if(Math.random() < .5)
                {
                    box[i][j] = 1;
                }
                else
                {
                    box[i][j] = 0;
                }
            }
        }
    }
    
    public void nextGen()
    {
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                if(i == 0 && j == 0) //Upper Left
                {
                    check += box[rows-1][columns-1];//Top Left
                    check += box[rows-1][j];//Up
                    check += box[rows-1][j+1];//Top Right
                    check += box[i][j+1];//Right
                    check += box[i+1][j+1];//Bottom Right
                    check += box[i+1][j];//Down
                    check += box[i+1][columns-1];//Bottom Left
                    check += box[i][columns-1];//Left
                    
                    if(box[i][j] == 1)
                    {
                        if(check < 2)
                        {
                            box2[i][j] = 0;
                        }
                        else if(check > 3)
                        {
                            box2[i][j] = 0;
                        }
                        else
                        {
                            box2[i][j] = 1;
                        }
                    }
                    else
                    {
                        if(check == 3)
                        {
                            box2[i][j] = 1;
                        }
                        else
                        {
                            box2[i][j] = 0;
                        }
                    }
                    check = 0;
                }
                else if(i == 0 && j == columns-1)//Upper Right
                {
                    check += box[rows-1][j-1];//Top Left
                    check += box[rows-1][j];//Up
                    check += box[rows-1][0];//Top Right
                    check += box[0][0];//Right
                    check += box[i+1][0];//Bottom Right
                    check += box[i+1][j];//Down
                    check += box[i+1][j-1];//Bottom Left
                    check += box[i][j-1];//Left
                    
                    if(box[i][j] == 1)
                    {
                        if(check < 2)
                        {
                            box2[i][j] = 0;
                        }
                        else if(check > 3)
                        {
                            box2[i][j] = 0;
                        }
                        else
                        {
                            box2[i][j] = 1;
                        }
                    }
                    else
                    {
                        if(check == 3)
                        {
                            box2[i][j] = 1;
                        }
                        else
                        {
                            box2[i][j] = 0;
                        }
                    }
                    check = 0;
                }
                else if(i == rows-1 && j == 0)//Bottom Left
                {
                    check += box[i-1][columns-1];//Top Left
                    check += box[i-1][j];//Up
                    check += box[i-1][j+1];//Top Right
                    check += box[i][j+1];//Right
                    check += box[0][j+1];//Bottom Right
                    check += box[0][0];//Down
                    check += box[0][columns-1];//Bottom Left
                    check += box[i][columns-1];//Left
                    
                    if(box[i][j] == 1)
                    {
                        if(check < 2)
                        {
                            box2[i][j] = 0;
                        }
                        else if(check > 3)
                        {
                            box2[i][j] = 0;
                        }
                        else
                        {
                            box2[i][j] = 1;
                        }
                    }
                    else
                    {
                        if(check == 3)
                        {
                            box2[i][j] = 1;
                        }
                        else
                        {
                            box2[i][j] = 0;
                        }
                    }
                    check = 0;
                }
                else if(i == rows-1 && j == columns-1)//Bottom Right
                {
                    check += box[i-1][j-1];//Top Left
                    check += box[i-1][j];//Up
                    check += box[i-1][0];//Top Right
                    check += box[i][0];//Right
                    check += box[0][0];//Bottom Right
                    check += box[0][columns-1];//Down
                    check += box[0][j-1];//Bottom Left
                    check += box[i][j-1];//Left
                    
                    if(box[i][j] == 1)
                    {
                        if(check < 2)
                        {
                            box2[i][j] = 0;
                        }
                        else if(check > 3)
                        {
                            box2[i][j] = 0;
                        }
                        else
                        {
                            box2[i][j] = 1;
                        }
                    }
                    else
                    {
                        if(check == 3)
                        {
                            box2[i][j] = 1;
                        }
                        else
                        {
                            box2[i][j] = 0;
                        }
                    }
                    check = 0;
                }
                
                else if(i == 0 && j != 0 && j != columns-1)//Up
                {
                    check += box[rows-1][j-1];//Top Left
                    check += box[rows-1][j];//Up
                    check += box[rows-1][j+1];//Top Right
                    check += box[i][j+1];//Right
                    check += box[i+1][j+1];//Bottom Right
                    check += box[i+1][j];//Down
                    check += box[i+1][j-1];//Bottom Left
                    check += box[i][j-1];//Left
                    
                    if(box[i][j] == 1)
                    {
                        if(check < 2)
                        {
                            box2[i][j] = 0;
                        }
                        else if(check > 3)
                        {
                            box2[i][j] = 0;
                        }
                        else
                        {
                            box2[i][j] = 1;
                        }
                    }
                    else
                    {
                        if(check == 3)
                        {
                            box2[i][j] = 1;
                        }
                        else
                        {
                            box2[i][j] = 0;
                        }
                    }
                    check = 0;
                }
                else if(i == rows-1 && j != 0 && j != columns-1)//Down
                {
                    check += box[i-1][j-1];//Top Left
                    check += box[i-1][j];//Up
                    check += box[i-1][j+1];//Top Right
                    check += box[i][j+1];//Right
                    check += box[0][j+1];//Bottom Right
                    check += box[0][j];//Down
                    check += box[0][j-1];//Bottom Left
                    check += box[i][j-1];//Left
                    
                    if(box[i][j] == 1)
                    {
                        if(check < 2)
                        {
                            box2[i][j] = 0;
                        }
                        else if(check > 3)
                        {
                            box2[i][j] = 0;
                        }
                        else
                        {
                            box2[i][j] = 1;
                        }
                    }
                    else
                    {
                        if(check == 3)
                        {
                            box2[i][j] = 1;
                        }
                        else
                        {
                            box2[i][j] = 0;
                        }
                    }
                    check = 0;
                }
                else if(j == 0 && i != 0 && i != rows-1)//Left
                {
                    check += box[i-1][columns-1];//Top Left
                    check += box[i-1][j];//Up
                    check += box[i-1][j+1];//Top Right
                    check += box[i][j+1];//Right
                    check += box[i+1][j+1];//Bottom Right
                    check += box[i+1][j];//Down
                    check += box[i+1][columns-1];//Bottom Left
                    check += box[i][columns-1];//Left
                    
                    if(box[i][j] == 1)
                    {
                        if(check < 2)
                        {
                            box2[i][j] = 0;
                        }
                        else if(check > 3)
                        {
                            box2[i][j] = 0;
                        }
                        else
                        {
                            box2[i][j] = 1;
                        }
                    }
                    else
                    {
                        if(check == 3)
                        {
                            box2[i][j] = 1;
                        }
                        else
                        {
                            box2[i][j] = 0;
                        }
                    }
                    check = 0;
                }
                else if(j == columns-1 && i != 0 && i != rows-1)//Right
                {
                    check += box[i-1][j-1];//Top Left
                    check += box[i-1][j];//Up
                    check += box[i-1][0];//Top Right
                    check += box[i][0];//Right
                    check += box[i+1][0];//Bottom Right
                    check += box[i+1][j];//Down
                    check += box[i+1][j-1];//Bottom Left
                    check += box[i][j-1];//Left
                    
                    if(box[i][j] == 1)
                    {
                        if(check < 2)
                        {
                            box2[i][j] = 0;
                        }
                        else if(check > 3)
                        {
                            box2[i][j] = 0;
                        }
                        else
                        {
                            box2[i][j] = 1;
                        }
                    }
                    else
                    {
                        if(check == 3)
                        {
                            box2[i][j] = 1;
                        }
                        else
                        {
                            box2[i][j] = 0;
                        }
                    }
                    check = 0;
                }
                else
                {
                    check += box[i-1][j-1];//Top Left
                    check += box[i-1][j];//Up
                    check += box[i-1][j+1];//Top Right
                    check += box[i][j+1];//Right
                    check += box[i+1][j+1];//Bottom Right
                    check += box[i+1][j];//Down
                    check += box[i+1][j-1];//Bottom Left
                    check += box[i][j-1];//Left
                    
                    if(box[i][j] == 1)
                    {
                        if(check < 2)
                        {
                            box2[i][j] = 0;
                        }
                        else if(check > 3)
                        {
                            box2[i][j] = 0;
                        }
                        else
                        {
                            box2[i][j] = 1;
                        }
                    }
                    else
                    {
                        if(check == 3)
                        {
                            box2[i][j] = 1;
                        }
                        else
                        {
                            box2[i][j] = 0;
                        }
                    }
                    check = 0;
                }
            }
        }
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                box[i][j] = box2[i][j];
            }
        }
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                box2[i][j] = 0;
            }
        }
    }
    
    public String toString()
    {
        String r = "";
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                if(box[i][j] == 1)
                {
                    r += " ● ";
                }
                else
                {
                    r += " - ";
                }
            }
            r += "\n";
        }
        return r;
    }
    
    public void glider()
    {
        box[2][1] = 1;
        box[1][3] = 1;
        box[2][3] = 1;
        box[3][3] = 1;
        box[3][2] = 1;
    }
}
