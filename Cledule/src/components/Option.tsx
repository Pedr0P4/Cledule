import { useState } from "react";
import point from "../assets/point.png";

interface OptionProps {
  children: React.ReactNode;
}

function Option({ children }: OptionProps) {
  const [isHovered, setIsHovered] = useState(false);

  const onMouseEnter = () => setIsHovered(true);
  const onMouseOut = () => setIsHovered(false);

  return (
    <li
      className="flex items-center my-4 hover:cursor-pointer"
      onMouseEnter={onMouseEnter}
      onMouseLeave={onMouseOut}
    >
      <img
        src={point}
        alt="Point"
        className={`w-auto h-2 mx-4 transition ease-in-out delay-50 ${
          isHovered ? "brightness-50" : ""
        }`}
      />
      <span>{children}</span>
    </li>
  );
}

export default Option;
