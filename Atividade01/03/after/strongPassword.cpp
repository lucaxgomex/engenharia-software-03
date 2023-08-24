#include <iostream>
#include <string>
using namespace std;
//https://www.hackerrank.com/challenges/strong-password/problem (HackerRank)
//https://github.com/lucaxgomex/ifpi-ads/blob/Algoritmos/ifpi-ads-algoritmo2020.1/HackerRank/strongPassword.cpp (Questão 01)
//https://github.com/lucaxgomex/typescript-introduction/blob/main/engenharia-software03/Atividade03/q04.ts (Exemplo Polimorfismo)

class Password 
{
  public:
    Password() {};

  // method 1
  void strongPassword(string password) 
  {
    int missing;
    int returnValue;
    int number = getNumberFromAscii(password);
    int upper = getUppercaseFromAscii(password);
    int lower = getLowercaseFromAscii(password);
    int special = getSpecialCharacters(password);

    missing = number + upper + lower + special;
    int sumStrings = missing + password.length();

    if (!(sumStrings >= 6))
    {
        returnValue = missing;
    }
      missing += (6 - sumStrings);
      returnValue = missing;
    // return returnValue;
    cout << returnValue << endl;
  }

  // method 2
  int getNumberFromAscii(string password)
  {
    int n;
    for (int i = 0; i < password.length(); i++)
    {
      n = getValue(password[i], 48, 57);
    }
    return n;
  }
  
  // method 3
  int getUppercaseFromAscii(string password)
  {
    int u;
    for (int i = 0; i < password.length(); i++) 
    {
      u = getValue(password[i], 65, 90);
    }
    return u;
  }

  // method 4
  int getLowercaseFromAscii(string password)
  {
    int l;
    for (int i = 0; i < password.length(); i++) 
    {
      l = getValue(password[i], 97, 122);
    }
    return l;
  }

  // method 5
  int getSpecialCharacters(string password)
  {
    int sc;
    for (int i = 0; i < password.length(); i++)
    {
      sc = getValueSpecialCharacter(password[i]);
         
    }
    return sc;
  }

  int getValue(char character, int begin, int end) 
  {
    if (int(character) >= begin && int(character) <= end) 
    {
      return 0;  
      //break;
    }
    return 1;
  }

  int getValueSpecialCharacter(char character) {
    if (int(character) == 33 
      || int(character) >= 35 && int(character) <= 38 
      || int(character) >= 40 && int(character) <= 43
      || int(character) == 45
      || int(character) == 64
      || int(character) == 94)
      {
        return 0;
        //break;
      }
      return 1;
  }
  
  void validate(int size, string text) 
  {
    if (size != text.length()) 
    {
      throw std::invalid_argument("Valores devem ser iguais");
    }
    strongPassword(text);
  }
};

  int main(void)
  {
    Password objPassword;

    string password;
    int passwordSize;

    cin >> passwordSize;
    cin >> password;

    objPassword.validate(passwordSize, password);

    return 0;
  }
