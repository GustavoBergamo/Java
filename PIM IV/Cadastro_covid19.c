#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#define MAX_PACIENTES 1000


//Tela inicial
typedef enum {
    TELA_SAIR=-1,
    TELA_PRINCIPAL, //0
    TELA_CADASTRAR, //1
    TELA_DESCADASTRAR,//2
    TELA_LISTAR_TODOS,//3
} Telas;

//Cadastro pacientes
typedef struct {
    char separador1[8], nome[32];
    char telefone[14], endereco[50], cidade[30], estado[20], cpf[14];
    char cep[12], email[32], comorbidade[30], separador[8];
    int idade,dia,mes,ano,diaD,mesD,anoD;
} Covid;

typedef struct {
    Telas menu;
    int totalCovids;
    Covid pacientes[MAX_PACIENTES];
} CovidPacientes;

//Programa principal
int main (void) {
    int aA, mA, dA;

//Usuário: admin
    char usr[]="admin",usuario[20];

//Senha: 12345
    int senhaL, senha=12345;
    system("cls");
    printf("\t=============================\n");
    printf("\t Sistema de cadastro Covid-19\n");
    printf("\t=============================\n\n");
    while ( (strcmp(usr,usuario)!=0) || (senha!=senhaL)) {
        printf("Usuario: ");
        fflush(stdin);
        gets(usuario);
        printf("\nSenha: ");
        fflush(stdin);
        scanf("%d", &senhaL);
        system("cls");
    }

//abrindo/criando arquivo pacientes.txt
    CovidPacientes cadastro;
    memset(&cadastro, 0x0, sizeof(cadastro));
    cadastro.menu = TELA_PRINCIPAL;
    FILE * memoria = fopen("pacientes.txt", "a+");
    FILE * risco;
    if (memoria == NULL){
        printf("Erro ao criar ou abrir arquivo de memoria de pacientes.   \n");
        return 1;
    }

//Cadastro de pacientes
    size_t lidos = fread(cadastro.pacientes, sizeof(Covid), MAX_PACIENTES, memoria);
    printf("Lidos %zd pacientes\n", lidos);
    cadastro.totalCovids = (int)lidos;
    fclose(memoria);
    time_t mytime;
    mytime = time(NULL);
    struct tm tm = *localtime(&mytime);
    aA=tm.tm_year+1900;
    mA=tm.tm_mon+1;
    dA=tm.tm_mday;
    printf("Data: %d/%d/%d\n", dA, mA, aA);

//Tela de cadastro
    while (cadastro.menu != TELA_SAIR) {
            switch (cadastro.menu){
                case TELA_PRINCIPAL: {
                    printf("\t=================\n");
                    printf("\tCADASTRO COVID 19\n");
                    printf("\t=================\n\n");
                    int opcao = -1;
                    do {
                        printf("(1) Cadastro de paciente\n");
                        printf("(2) Apagar cadastro de paciente\n");
                        printf("(3) Exibir todos os pacientes\n");
                        printf("(0) Sair do programa\n");
                        printf("Digite a opcao:");
                        scanf("%d", &opcao);
                        int c = 0;
                        while ((c = getchar()) != '\n' && c != EOF) { }
                    }

//Laço de repetição até escolher opção válida
                    while (opcao < 0 ||  opcao > 3);
                    if (opcao == 0)
                    cadastro.menu = TELA_SAIR;
                    if (opcao == 1) {
                        cadastro.menu = TELA_CADASTRAR;
                        if (cadastro.totalCovids >= MAX_PACIENTES) {
                            system("cls");
                            printf("\tCadastro excede limite, nao e possivel adicionar\n");
                            cadastro.menu = TELA_PRINCIPAL;
                        }
                    }
                    if (opcao == 2) {
                        cadastro.menu = TELA_DESCADASTRAR;
                        if (cadastro.totalCovids == 0) {
                            system("cls");
                            printf("\t------------------------------------\n");
                            printf("\tImpossivel remover, nao ha cadastros\n");
                            printf("\t------------------------------------\n");
                            cadastro.menu = TELA_PRINCIPAL;
                        }
                    }
                    if (opcao == 3) {
                        cadastro.menu = TELA_LISTAR_TODOS;
                        if (cadastro.totalCovids == 0) {
                            system("cls");
                            printf("\t--------------------------\n");
                            printf("\tNenhum paciente cadastrado\n");
                            printf("\t--------------------------\n");
                            //volta para tela principal
                            cadastro.menu = TELA_PRINCIPAL;
                        }
                    }
                }
                break;
                case TELA_CADASTRAR: {
                    printf("\t--------------------\n");
                    printf("\tCADASTRO DE PACIENTE\n");
                    printf("\t--------------------\n");
                    Covid novo;
                    char opcao = 's';
                    do {
                        memset(&novo, 0x0, sizeof(novo));
                        strcpy(novo.separador1,   "---\n");
                        printf("Paciente: ");
                        fflush(stdin);
                        fgets(novo.nome, 32, stdin);
                        int id = 0;
                        while (novo.nome[id] != '\0' && novo.nome[id] != '\n')
                        id++;
                        novo.nome[id] = '\0';
                        novo.nome[31]   =  '\n';
                        printf("Telefone: ");
                        fflush(stdin);
                        fgets(novo.telefone, 14, stdin);
                        id = 0;
                        while (novo.telefone[id] != '\0' && novo.telefone[id] != '\n')
                        id++;
                        novo.telefone[id] = '\0';
                        printf("Endereco: ");
                        fflush(stdin);
                        fgets(novo.endereco, 50, stdin);
                        id = 0;
                        while (novo.endereco[id] != '\0' && novo.endereco[id] != '\n')
                        id++;
                        novo.endereco[id] = '\0';
                        novo.endereco[49] = '\n';
                        printf("  Cidade: ");
                        fflush(stdin);
                        fgets(novo.cidade, 30, stdin);
                        id = 0;
                        while (novo.cidade[id] != '\0' && novo.cidade[id] != '\n')
                        id++;
                        novo.cidade[id] = '\0';
                        novo.cidade[29] = '\n';
                        printf("  Estado: ");
                        fflush(stdin);
                        fgets(novo.estado, 20, stdin);
                        id = 0;
                        while (novo.estado[id] != '\0' && novo.estado[id] != '\n')
                        id++;
                        novo.estado[id] = '\0';
                        novo.estado[19] = '\n';
                        printf("     CPF: "); fflush(stdin);
                        fgets(novo.cpf, 14, stdin);
                        id = 0;
                        while (novo.cpf[id] != '\0' && novo.cpf[id] != '\n')
                        id++;
                        novo.cpf[id] = '\0';
                        novo.cpf[13] = '\n';
                        printf("     CEP: ");
                        fflush(stdin);
                        fgets(novo.cep, 12, stdin);
                        id = 0;
                        while (novo.cep[id] != '\0' && novo.cep[id] != '\n')
                        id++;
                        novo.cep[id] = '\0';
                        novo.cep[11] = '\n';
                        printf("  E-mail: "); fflush(stdin);
                        fgets(novo.email, 32, stdin);
                        id = 0;
                        while (novo.email[id] != '\0' && novo.email[id] != '\n')
                        id++;
                        novo.email[id] = '\0';
                        novo.email[31] = '\n';
                        system("cls");
                        printf("Paciente possui comorbidades?\n");
                        printf("Se nao houver, tecle <enter>\n");
                        fflush(stdin);
                        fgets(novo.comorbidade, 30, stdin);
                        id = 0;
                        while (novo.comorbidade[id] != '\0' && novo.comorbidade[id] != '\n')
                        id++;
                        novo.comorbidade[id] = '\0';
                        system("cls");
                        printf("Data de nascimento\n");
                        printf("Dia: ");
                        fflush(stdin);
                        scanf("%d", &novo.dia);
                        printf("\nMes: ");
                        fflush(stdin);
                        scanf("%d", &novo.mes);
                        printf("\nAno: ");
                        fflush(stdin);
                        scanf("%d", &novo.ano);
                        system("cls");
                        printf("Data do diagnostico\n");
                        printf("Dia: ");
                        fflush(stdin);
                        scanf("%d", &novo.diaD);
                        printf("\nMes: ");
                        fflush(stdin);
                        scanf("%d", &novo.mesD);
                        printf("\nAno: ");
                        fflush(stdin);
                        scanf("%d", &novo.anoD);
                        strcpy(novo.separador, "\n---");

//Cálculo da idade e confirmação de adicionar paciente
                        if   (novo.mes<=mA   &&   novo.dia   <=   dA)
                            {novo.idade=aA-novo.ano;
                        }
                        else if (novo.mes>=mA && novo.dia > dA)
                            {novo.idade=aA-novo.ano-1;
                        }
                        else if (novo.mes>=mA && novo.dia <= dA)
                            {novo.idade=aA-novo.ano-1;
                        }
                        else if (novo.mes<=mA && novo.dia > dA)
                            {novo.idade=aA-novo.ano;
                        }
                        system("cls");
                        printf("+--------+\n");
                        printf("|PACIENTE: %s\n", novo.nome);
                        printf("|   IDADE: %d anos\n", novo.idade);
                        printf("|     CPF: %s\n", novo.cpf);
                        printf("+--------+\n");
                        printf("\nADICIONAR [s/n]? "); opcao = getchar();
                        int c = 0;
                        while ((c = getchar()) != '\n' && c != EOF) { }
                    }
                    while (opcao == 'n' || opcao == 'N');
                    cadastro.pacientes[cadastro.totalCovids] = novo;
                    cadastro.totalCovids++;

//Escrever em pacientes.txt
                    memoria = fopen("pacientes.txt", "a+");
                    if (memoria == NULL) {
                        printf("Erro ao abrir pacientes.txt\n");
                        return 0;
                    }
                    size_t salvos = fwrite(cadastro.pacientes, sizeof(Covid), cadastro.totalCovids,memoria);
                    if (salvos != (size_t)cadastro.totalCovids) {
                        printf("Erro ao salvar.\n"); return 1;
                    }
                    fclose(memoria);

//Se maior 65 salvar
                    risco=fopen("risco.txt","a+");
                    if (novo.idade>=65 || novo.comorbidade[strlen(novo.comorbidade)-1] != '\0') {
                        fprintf(risco,"%s ",novo.cep);
                        fprintf(risco,"%d ",novo.idade);
                        fprintf(risco,"%s\n\n",novo.comorbidade);
                        printf("Adicionado ao arquivo risco.txt\n");
                    }
                    fclose(risco);

                    cadastro.menu = TELA_PRINCIPAL;
                }
                break;

//Tela de descadastro
                case TELA_DESCADASTRAR: {
                printf("\t-----------------------\n");
                printf("\tDescadastrar de paciente\n");
                printf("\t-----------------------\n");
                int i;
                for (i = 0; i < cadastro.totalCovids; i++) {
                        printf("Covid %d\n", i);
                        printf("\tNome: %s\n", cadastro.pacientes[i].nome);
                        printf("\tTelefone: %s\n", cadastro.pacientes[i].telefone);
                        printf("\tEndereco: %s\n", cadastro.pacientes[i].endereco);
                        printf("----------------------------------------------------\n");
                    }
                    int indice = -1;
                     do {
                        printf("Digite o numero do paciente para descadastrar: de 0 até %d\n",cadastro.totalCovids-1);
                        fflush(stdin);
                        scanf("%d", &indice);
                        int c = 0;
                        while ((c = getchar()) != '\n' && c != EOF) { }
                    }
                    while (indice < 0 || indice >= cadastro.totalCovids);
                     for (i = indice; i < cadastro.totalCovids - 1; i++)
                    cadastro.pacientes[i] = cadastro.pacientes[i + 1];
                    cadastro.totalCovids--;
                    memoria = fopen("pacientes.txt", "w+");
                    if (memoria == NULL) {
                        printf("Erro ao abrir pacientes.txt\n");
                        return 0;
                    }
                    size_t salvos = fwrite(cadastro.pacientes, sizeof(Covid), cadastro.totalCovids,memoria);
                    if (salvos != (size_t)cadastro.totalCovids) {
                        printf("Erro ao salvar em pacientes.txt\n");
                        return 1;
                   }
                    fclose(memoria);
                    cadastro.menu = TELA_PRINCIPAL;
                }
                break;

//Listar pacientes
                case TELA_LISTAR_TODOS: {
                    system("cls");
                    printf("\t-------------PACIENTES-------------\n");
                    int i;
                    for (i = 0; i < cadastro.totalCovids; i++) {
                        printf("    Registro: %d\n", i);
                        printf("        Nome: %s\n", cadastro.pacientes[i].nome);
                        printf("    Telefone: %s\n", cadastro.pacientes[i].telefone);
                        printf("    Endereco: %s\n", cadastro.pacientes[i].endereco);
                        printf("      Cidade: %s\n", cadastro.pacientes[i].cidade);
                        printf("      Estado: %s\n", cadastro.pacientes[i].estado);
                        printf("         Cpf: %s\n", cadastro.pacientes[i].cpf);
                        printf("         Cep: %s\n", cadastro.pacientes[i].cep);
                        printf("      E-mail: %s\n", cadastro.pacientes[i].email);
                        printf("Comorbidades: %s\n", cadastro.pacientes[i].comorbidade);
                        printf("       Idade: %d/%d/%d\n", cadastro.pacientes[i].dia, cadastro.pacientes[i].mes,cadastro.pacientes[i].ano);
                        printf(" Diagnostico: %d%d%d\n", cadastro.pacientes[i].diaD, cadastro.pacientes[i].mesD, cadastro.pacientes[i].anoD);
                        printf("-------------\n");
                    }
                    cadastro.menu = TELA_PRINCIPAL;
                }
                break;
                default:
                cadastro.menu = TELA_PRINCIPAL;
                break;
            }
        }
        return 0;
    }


