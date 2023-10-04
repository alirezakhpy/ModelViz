package DecisionDashboard.project.design;

import java.util.EnumSet;

import org.eclipse.emf.ecore.EObject;
import decisionDashboardMetaModel.DecisionAreaList;
import decisionDashboardMetaModel.VAGoalTypeList;
import decisionDashboardMetaModel.VATaskTypeList;
import decisionDashboardMetaModel.VisualFormatList;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public static EnumSet<VAGoalTypeList> visualizationGoalSelect(EObject self, Enum<DecisionAreaList> arg) {
    	if (DecisionAreaList.SALES_MANAGEMENT == arg) {
    		EnumSet<VAGoalTypeList> set = EnumSet.of(VAGoalTypeList.VIEWING_DATA_FROM_SINGLE_VARIABLE_POINT_OF_VIEW, VAGoalTypeList.EXPLORING_DIMENSION_BY_DIVIDING_TO_INTERVALS, VAGoalTypeList.FINDING_RELATIONS_BETWEEN_DATA_RECORDS, VAGoalTypeList.VISUALIZING_MULTI_DIMENSIONALITY_BY_CLUSTERING_NEXT_VERSION, VAGoalTypeList.EXPLORING_SPATIO_TEMPORALITY_NEXT_VERSION);
    		return set;
    	}
    	else if (DecisionAreaList.DEMAND_MANAGAMENT == arg) {
    		EnumSet<VAGoalTypeList> set = EnumSet.of(VAGoalTypeList.IDENTIFYING_UNDERLYING_PATTERN_BY_PARTITIONING, VAGoalTypeList.VIEWING_DATA_FROM_SINGLE_VARIABLE_POINT_OF_VIEW, VAGoalTypeList.DIMENSIONALITY_REDUCTION_NEXT_VERSION);
    		return set;
		}
    	else if (DecisionAreaList.NETWORK_INTEGRATION_AND_VISIBILITY == arg) {
    		EnumSet<VAGoalTypeList> set = EnumSet.of(VAGoalTypeList.VIEWING_DATA_FROM_SINGLE_VARIABLE_POINT_OF_VIEW, VAGoalTypeList.GEOGRAPHIC_INFORMATION_VISUALIZATION_NEXT_VERSION, VAGoalTypeList.WHAT_IF_ANALYSIS_BASED_ON_SCENARIO_BASED_TECHNIQUES_NEXT_VERSION, VAGoalTypeList.DEMONSTRATE_RISK_DISTRIBUTION_IN_THE_NETWORK_NEXT_VERSION, VAGoalTypeList.EXPLORING_SPATIO_TEMPORALITY_NEXT_VERSION);
    		return set;
		}
    	else if (DecisionAreaList.PRODUCTION_AND_DISTRIBUTION_PLANNING == arg) {
    		EnumSet<VAGoalTypeList> set = EnumSet.of(VAGoalTypeList.EXPLORING_TIME_DEPENDANT_MULTIVARIATE_DATA, VAGoalTypeList.VIEWING_DATA_FROM_SINGLE_VARIABLE_POINT_OF_VIEW, VAGoalTypeList.EXPLORING_DIMENSION_BY_DIVIDING_TO_INTERVALS, VAGoalTypeList.FINDING_RELATIONS_BETWEEN_DATA_RECORDS, VAGoalTypeList.VISUALIZING_MULTI_DIMENSIONALITY_BY_CLUSTERING_NEXT_VERSION, VAGoalTypeList.EXPLORING_SPATIO_TEMPORALITY_NEXT_VERSION);
    		return set;
		}
		return null;
    }
    public static EnumSet<VATaskTypeList> visualizationTaskSelect(EObject self, Enum<VAGoalTypeList> arg) {
    	if (VAGoalTypeList.VIEWING_DATA_FROM_SINGLE_VARIABLE_POINT_OF_VIEW == arg) {
    		EnumSet<VATaskTypeList> set = EnumSet.of(VATaskTypeList.SIMILARITY_VIEW_SHOWING_SIMILAR_HISTORICAL_DATA, VATaskTypeList.PROVIDING_DETAIL_VIEW_OF_INDIVIDUAL_VARIABLES);
    		return set;
    	}
    	else if (VAGoalTypeList.EXPLORING_DIMENSION_BY_DIVIDING_TO_INTERVALS == arg) {
    		EnumSet<VATaskTypeList> set = EnumSet.of(VATaskTypeList.EXPLORING_FILTER_COORDINATION);
    		return set;
		}
    	else if (VAGoalTypeList.FINDING_RELATIONS_BETWEEN_DATA_RECORDS == arg) {
    		EnumSet<VATaskTypeList> set = EnumSet.of(VATaskTypeList.SHOW_DEPENDENCY_OF_AN_ATTRIBUTE_TO_TIME,VATaskTypeList.VISUALIZING_SINGLE_DIMENSIONS, VATaskTypeList.VISUALIZING_ACATEGORICAL_DIMENSION_AGAINST_ANUMERICAL, VATaskTypeList.VISUALIZING_TWO_NUMERICAL_DIMENSIONS);
    		return set;
		}
    	else if (VAGoalTypeList.IDENTIFYING_UNDERLYING_PATTERN_BY_PARTITIONING == arg) {
    		EnumSet<VATaskTypeList> set = EnumSet.of(VATaskTypeList.DISTRIBUTION_OVER_TEMPORAL_DIMENSION_BY_EMPHASIZING_ON_INDIVIDUAL_VALUES_FOR_TREND_DETECTION);
    		return set;
		}
    	else if (VAGoalTypeList.EXPLORING_TIME_DEPENDANT_MULTIVARIATE_DATA == arg) {
    		EnumSet<VATaskTypeList> set = EnumSet.of(VATaskTypeList.SHOW_DEPENDENCY_OF_AN_ATTRIBUTE_TO_TIME, VATaskTypeList.SHOW_DENSITY_OF_THE_DATA);
    		return set;
		}
		return null;
    }
    public static EnumSet<VisualFormatList> visualizationVisualSelect(EObject self, Enum<VATaskTypeList> arg) {
    	if (VATaskTypeList.SIMILARITY_VIEW_SHOWING_SIMILAR_HISTORICAL_DATA == arg) {
    		EnumSet<VisualFormatList> set = EnumSet.of(VisualFormatList.CIRCLE, VisualFormatList.BAR, VisualFormatList.BUBBLE_MAP_NEXT_VERSION);
    		return set;
    	}
    	else if (VATaskTypeList.PROVIDING_DETAIL_VIEW_OF_INDIVIDUAL_VARIABLES == arg) {
    		EnumSet<VisualFormatList> set = EnumSet.of(VisualFormatList.BAR, VisualFormatList.LINE, VisualFormatList.FORCE_DIRECTED_GRAPH_NEXT_VERSION);
    		return set;
		}
    	else if (VATaskTypeList.EXPLORING_FILTER_COORDINATION == arg) {
    		EnumSet<VisualFormatList> set = EnumSet.of(VisualFormatList.BAR, VisualFormatList.LINE, VisualFormatList.CIRCLE);
    		return set;
		}
    	else if (VATaskTypeList.SHOW_DEPENDENCY_OF_AN_ATTRIBUTE_TO_TIME == arg) {
    		EnumSet<VisualFormatList> set = EnumSet.of(VisualFormatList.CIRCLE, VisualFormatList.SQUARE, VisualFormatList.AREA, VisualFormatList.POINT_NEXT_VERSION);
    		return set;
		}
    	else if (VATaskTypeList.VISUALIZING_SINGLE_DIMENSIONS == arg) {
    		EnumSet<VisualFormatList> set = EnumSet.of(VisualFormatList.BAR, VisualFormatList.TREE_VIEW_NEXT_VERSION, VisualFormatList.HEAT_MAP_NEXT_VERSION);
    		return set;
		}
    	else if (VATaskTypeList.VISUALIZING_ACATEGORICAL_DIMENSION_AGAINST_ANUMERICAL == arg) {
    		EnumSet<VisualFormatList> set = EnumSet.of(VisualFormatList.BAR, VisualFormatList.CIRCLE, VisualFormatList.LINE, VisualFormatList.SQUARE, VisualFormatList.THEME_RIVERS_NEXT_VERSION);
    		return set;
		}
    	else if (VATaskTypeList.VISUALIZING_TWO_NUMERICAL_DIMENSIONS == arg) {
    		EnumSet<VisualFormatList> set = EnumSet.of(VisualFormatList.CIRCLE, VisualFormatList.BAR, VisualFormatList.LINE, VisualFormatList.SQUARE);
    		return set;
		}
    	else if (VATaskTypeList.DISTRIBUTION_OVER_TEMPORAL_DIMENSION_BY_EMPHASIZING_ON_INDIVIDUAL_VALUES_FOR_TREND_DETECTION == arg) {
    		EnumSet<VisualFormatList> set = EnumSet.of(VisualFormatList.BAR, VisualFormatList.LINE);
    		return set;
		}
    	else if (VATaskTypeList.SHOW_DEPENDENCY_OF_AN_ATTRIBUTE_TO_TIME == arg) {
    		EnumSet<VisualFormatList> set = EnumSet.of(VisualFormatList.CIRCLE, VisualFormatList.HISTOGRAM, VisualFormatList.BAR , VisualFormatList.AREA, VisualFormatList.POINT_NEXT_VERSION);
    		return set;
		}
    	else if (VATaskTypeList.SHOW_DENSITY_OF_THE_DATA == arg) {
    		EnumSet<VisualFormatList> set = EnumSet.of(VisualFormatList.AREA, VisualFormatList.CIRCLE, VisualFormatList.HISTOGRAM);
    		return set;
		}
		return null;
    }
}
