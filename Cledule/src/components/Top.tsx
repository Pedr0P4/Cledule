import logoProv from "../assets/logo-prov.png";

function Top() {
  return (
    <div className="bg-neutral-200 h-25 flex justify-between items-center">
      <div>
        <img src={logoProv} alt="logo-prov" className="h-20 m-4" />
      </div>
      <div className="flex m-5">
        <div className="w-30 mx-1">
          <h3 className="cursor-pointer m-auto border-b-2 w-20 my-2 h-8 text-xl text-center transition-all ease-in-out hover:w-full">
            Início
          </h3>
        </div>
        <div className="w-30 mx-1">
          <h3 className="cursor-pointer m-auto border-b-2 w-20 my-2 h-8 text-xl text-center transition-all ease-in-out hover:w-full">
            Sobre
          </h3>
        </div>
      </div>
      <div className="flex m-5">
        <button className="cursor-pointer bg-neutral-500 text-white block m-1 p-3 transition ease-in-out hover:bg-neutral-600">
          Registrar
        </button>
        <button className="cursor-pointer bg-neutral-500 text-white block m-1 p-3 transition ease-in-out hover:bg-neutral-600">
          Entrar
        </button>
      </div>
    </div>
  );
}

export default Top;
