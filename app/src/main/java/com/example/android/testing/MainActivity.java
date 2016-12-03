package com.example.android.testing;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int i, j;
    EasyAI ai = new EasyAI();
    int count = 0;
    int c[][] = new int[3][3];
    TextView text;
    Button b[][] = new Button[3][3];
    Button r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b[0][0] = (Button) findViewById(R.id.e1);
        b[0][1] = (Button) findViewById(R.id.e2);
        b[0][2] = (Button) findViewById(R.id.e3);
        b[1][0] = (Button) findViewById(R.id.e4);
        b[1][1] = (Button) findViewById(R.id.e5);
        b[1][2] = (Button) findViewById(R.id.e6);
        b[2][0] = (Button) findViewById(R.id.e7);
        b[2][1] = (Button) findViewById(R.id.e8);
        b[2][2] = (Button) findViewById(R.id.e9);
        text = (TextView) findViewById(R.id.easyText);

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                c[i][j] = 2; //enable
            }
        }

        // r.setOnClickListener(this);
        b[0][0].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                count++;
                b[0][0].setBackgroundColor(Color.parseColor("#FFFF00"));
                if (b[0][0].isEnabled()) {
                    b[0][0].setEnabled(false);
                    //O represent users
                    b[0][0].setText("O");
                    c[0][0] = 0;
                    text.setText("playing");

                    if (!checkBoard()) {
                        ai.takeTurn();
                    } else {
                        reset();
                    }

                }
            }

        });


        b[2][0].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                count++;
                b[2][0].setBackgroundColor(Color.parseColor("#FFFF00"));
                if (b[2][0].isEnabled()) {
                    b[2][0].setEnabled(false);
                    //O represent users
                    b[2][0].setText("O");
                    c[2][0] = 0;
                    text.setText("playing");

                    if (!checkBoard()) {
                        ai.takeTurn();
                    } else {
                        reset();
                    }

                }
            }

        });


        b[2][1].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                count++;
                b[2][1].setBackgroundColor(Color.parseColor("#FFFF00"));
                if (b[2][1].isEnabled()) {
                    b[2][1].setEnabled(false);
                    //O represent users
                    b[2][1].setText("O");
                    c[2][1] = 0;
                    text.setText("playing");

                    if (!checkBoard()) {
                        ai.takeTurn();
                    } else {
                        reset();
                    }

                }
            }

        });


        b[2][2].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                count++;
                b[2][2].setBackgroundColor(Color.parseColor("#FFFF00"));
                if (b[2][2].isEnabled()) {
                    b[2][2].setEnabled(false);
                    //O represent users
                    b[2][2].setText("O");
                    c[2][2] = 0;
                    text.setText("playing");

                    if (!checkBoard()) {
                        ai.takeTurn();
                    } else {
                        reset();
                    }

                }
            }

        });


        b[0][1].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                count++;
                b[0][1].setBackgroundColor(Color.parseColor("#FFFF00"));
                if (b[0][1].isEnabled()) {
                    b[0][1].setEnabled(false);
                    //O represent users
                    b[0][1].setText("O");
                    c[0][1] = 0;
                    text.setText("playing");

                    if (!checkBoard()) {
                        ai.takeTurn();
                    } else {
                        reset();
                    }

                }
            }

        });


        b[0][2].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                count++;
                b[0][2].setBackgroundColor(Color.parseColor("#FFFF00"));
                if (b[0][2].isEnabled()) {
                    b[0][2].setEnabled(false);
                    //O represent users
                    b[0][2].setText("O");
                    c[0][2] = 0;
                    text.setText("playing");

                    if (!checkBoard()) {
                        ai.takeTurn();
                    } else {
                        reset();
                    }

                }
            }

        });


        b[1][0].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                count++;
                b[1][0].setBackgroundColor(Color.parseColor("#FFFF00"));
                if (b[1][0].isEnabled()) {
                    b[1][0].setEnabled(false);
                    //O represent users
                    b[1][0].setText("O");
                    c[1][0] = 0;
                    text.setText("playing");

                    if (!checkBoard()) {
                        ai.takeTurn();
                    } else {
                        reset();
                    }

                }
            }

        });


        b[1][1].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                count++;
                b[1][1].setBackgroundColor(Color.parseColor("#FFFF00"));
                if (b[1][1].isEnabled()) {
                    b[1][1].setEnabled(false);
                    //O represent users
                    b[1][1].setText("O");
                    c[1][1] = 0;
                    text.setText("playing");

                    if (!checkBoard()) {
                        ai.takeTurn();
                    } else {
                        reset();
                    }

                }
            }

        });


        b[1][2].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                count++;
                b[1][2].setBackgroundColor(Color.parseColor("#FFFF00"));
                if (b[1][2].isEnabled()) {
                    b[1][2].setEnabled(false);
                    //O represent users
                    b[1][2].setText("O");
                    c[1][2] = 0;
                    text.setText("playing");

                    if (!checkBoard()) {
                        ai.takeTurn();
                    } else {
                        reset();
                    }

                }
            }

        });


    }



/*public void get(int x,int y)
{
    c[x][y]=0;
}*/


/*
    public void onClick(View v) {
        //int id=v.get();

        Button bt=(Button)v;
        if (bt.isEnabled()) {
            bt.setEnabled(false);
            //O represent users
            bt.setText("O");
            //c[i][j] = 0;
            text.setText("playing");
        }
           /* if(!b[0][0].isEnabled())
            {
                c[0][0]=0;

            }
            else if(!b[0][1].isEnabled())
            {
                c[0][1]=0;
            }
            else if(!b[0][2].isEnabled())
            {
                c[0][2]=0;
            }
            else if(!b[1][0].isEnabled())
            {
                c[1][0]=0;
            }
            else if(!b[1][1].isEnabled())
            {
                c[1][1]=0;
            }
            else if(!b[1][2].isEnabled())
            {
                c[1][2]=0;
            }
            else if(!b[2][0].isEnabled())
            {
                c[2][0]=0;
            }
            else if(!b[2][1].isEnabled())
            {
                c[2][1]=0;
            }
            else if(!b[2][2].isEnabled())
            {
                c[2][2]=0;
            }

*/


    public void reset() {
        count = 0;
        //text.setText("In reset");
        if (!b[0][0].isEnabled()) {
            b[0][0].setBackgroundColor(Color.parseColor("#90CAF9"));

            b[0][0].setText("");
            //b[0][0].setBackgroundColor(Color.parseColor("#90CAF9"));
            b[0][0].setEnabled(true);

            c[0][0] = 2;
        }
        if (!b[0][1].isEnabled()) {
            b[0][1].setBackgroundColor(Color.parseColor("#90CAF9"));

            b[0][1].setText("");
            // b[0][1].setBackgroundColor(Color.parseColor("#90CAF9"));
            b[0][1].setEnabled(true);

            c[0][1] = 2;
        }
        if (!b[0][2].isEnabled()) {
            b[0][2].setBackgroundColor(Color.parseColor("#90CAF9"));

            b[0][2].setText("");
            // b[0][2].setBackgroundColor(Color.parseColor("#90CAF9"));
            b[0][2].setEnabled(true);

            c[0][2] = 2;
        }
        if (!b[1][0].isEnabled()) {
            b[1][0].setBackgroundColor(Color.parseColor("#90CAF9"));

            b[1][0].setText("");
            // b[1][0].setBackgroundColor(Color.parseColor("#90CAF9"));
            b[1][0].setEnabled(true);

            c[1][0] = 2;
        }
        if (!b[1][1].isEnabled()) {
            b[1][1].setBackgroundColor(Color.parseColor("#90CAF9"));

            b[1][1].setText("");
            //  b[i][j].setBackgroundColor(Color.parseColor("#90CAF9"));
            b[1][1].setEnabled(true);

            c[1][1] = 2;
        }
        if (!b[1][2].isEnabled()) {
            b[1][2].setBackgroundColor(Color.parseColor("#90CAF9"));

            b[1][2].setText("");
            // b[i][j].setBackgroundColor(Color.parseColor("#90CAF9"));
            b[1][2].setEnabled(true);

            c[1][2] = 2;
        }
        if (!b[2][0].isEnabled()) {
            b[2][0].setBackgroundColor(Color.parseColor("#90CAF9"));

            b[2][0].setText("");
            //b[i][j].setBackgroundColor(Color.parseColor("#90CAF9"));
            b[2][0].setEnabled(true);

            c[2][0] = 2;
        }
        if (!b[2][1].isEnabled()) {
            b[2][1].setBackgroundColor(Color.parseColor("#90CAF9"));

            b[2][1].setText("");
            //     b[i][j].setBackgroundColor(Color.parseColor("#90CAF9"));
            b[2][1].setEnabled(true);

            c[2][1] = 2;
        }
        if (!b[2][2].isEnabled()) {
            b[2][2].setBackgroundColor(Color.parseColor("#90CAF9"));

            b[2][2].setText("");
            //b[i][j].setBackgroundColor(Color.parseColor("#90CAF9"));
            b[2][2].setEnabled(true);

            c[2][2] = 2;
        }


    }


    private class EasyAI {
        //MainActivity obj = new MainActivity();

        public void takeTurn() {
            Random r = new Random();
            int x = r.nextInt(3);
            int y = r.nextInt(3);
            while (c[x][y] != 2) {
                x = r.nextInt(3);
                y = r.nextInt(3);
            }
            //finding the right random choice
            //mark(a, b);
            b[x][y].setEnabled(false);
            b[x][y].setText("X");
            c[x][y] = 1;
            count++;
            checkBoard();

        }

     /*   private void mark(int x, int y) {
           b[x][y].setEnabled(false);
           b[x][y].setText("X");
           c[x][y] = 1;
            checkBoard();
        }*/
    }


    private boolean checkBoard() {

        boolean winner = false;
        if ((c[0][0] == 0 && c[1][1] == 0 && c[2][2] == 0) ||
                (c[0][2] == 0 && c[1][1] == 0 && c[2][0] == 0) || (c[0][0] == 0 && c[0][1] == 0 && c[0][2] == 0)
                || (c[1][0] == 0 && c[1][1] == 0 && c[1][2] == 0) || (c[2][0] == 0 && c[2][1] == 0 && c[2][2] == 0)
                || (c[0][0] == 0 && c[1][0] == 0 && c[2][0] == 0) || (c[0][1] == 0 && c[1][1] == 0 && c[2][1] == 0)
                || (c[0][2] == 0 && c[1][2] == 0 && c[2][2] == 0)) {
            text.setText("You Win!!!");
            winner = true;
        } else if ((c[0][0] == 1 && c[1][1] == 1 && c[2][2] == 1) ||
                (c[0][2] == 1 && c[1][1] == 1 && c[2][0] == 1) || (c[0][0] == 1 && c[0][1] == 1 && c[0][2] == 1)
                || (c[1][0] == 1 && c[1][1] == 1 && c[1][2] == 1) || (c[2][0] == 1 && c[2][1] == 1 && c[2][2] == 1)
                || (c[0][0] == 1 && c[1][0] == 1 && c[2][0] == 1) || (c[0][1] == 1 && c[1][1] == 1 && c[2][1] == 1)
                || (c[0][2] == 1 && c[1][2] == 1 && c[2][2] == 1)) {
            text.setText("Computer Wins !!!");
            winner = true;
        } else {
            // empty to check;
            // winner is not there
            boolean empty = false;
            //LABEL:
            if (!empty) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (b[i][j].isEnabled()) {
                            empty = true;
                            //text.setText("Yes The match DRAW!!!");//nothing left to be clicked
                            break ;
                        }
                    }
                }
            }


            if (!empty) {
                winner=true;
                text.setText("Yes The match DRAW!!!");
            }

        }

          /*  if (count >= 9 && winner == false) {
                text.setText("ITS DRAW!!!");

            }*/

        return winner;
    }

        }






