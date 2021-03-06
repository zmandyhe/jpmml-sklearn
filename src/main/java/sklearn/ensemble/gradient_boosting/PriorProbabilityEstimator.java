/*
 * Copyright (c) 2015 Villu Ruusmann
 *
 * This file is part of JPMML-SkLearn
 *
 * JPMML-SkLearn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JPMML-SkLearn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with JPMML-SkLearn.  If not, see <http://www.gnu.org/licenses/>.
 */
package sklearn.ensemble.gradient_boosting;

import java.util.List;

import com.google.common.collect.Iterables;
import org.jpmml.sklearn.PyClassDict;

public class PriorProbabilityEstimator extends PyClassDict implements HasPriorProbability {

	public PriorProbabilityEstimator(String module, String name){
		super(module, name);
	}

	@Override
	public Number getPriorProbability(int index){
		return Iterables.get(getPriors(), index);
	}

	public List<? extends Number> getPriors(){
		return getArray("priors", Number.class);
	}
}