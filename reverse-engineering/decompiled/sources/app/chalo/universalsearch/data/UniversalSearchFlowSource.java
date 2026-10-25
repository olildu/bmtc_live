package app.chalo.universalsearch.data;

import app.chalo.constants.Source;
import defpackage.ll1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0017\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u001a"}, d2 = {"Lapp/chalo/universalsearch/data/UniversalSearchFlowSource;", "", "sourceName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getSourceName", "()Ljava/lang/String;", "CITY_SELECTION", "HOME_SCREEN_MAIN_FRAGMENT", "HOME_SCREEN_TAB", "NEAR_BY_STOPS", "PREMIUM_FROM_STOP_SELECTION", "PREMIUM_TO_STOP_SELECTION", "REGULAR_BUS_SCREEN_TAB", "STOP_BASED_ROUTE_SEARCH_SCREEN", "TRIP_PLANNER", "ONDC_STOP_BASED_SEARCH_SCREEN", "STOP_FOCUSED_TRIP_PLANNER", "HOME_WORK_SELECTION", "HOME_PREFERENCE_SELECTION", "WORK_PREFERECNCE_SELECTION", "UNKNOWN", "toSource", "Lapp/chalo/constants/Source;", "Companion", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public enum UniversalSearchFlowSource {
    CITY_SELECTION("citySelection"),
    HOME_SCREEN_MAIN_FRAGMENT("homeScreenMainFragment"),
    HOME_SCREEN_TAB("homeScreenTab"),
    NEAR_BY_STOPS("nearByStops"),
    PREMIUM_FROM_STOP_SELECTION("premiumFromStopSelection"),
    PREMIUM_TO_STOP_SELECTION("premiumToStopSelection"),
    REGULAR_BUS_SCREEN_TAB("regularBusScreenTab"),
    STOP_BASED_ROUTE_SEARCH_SCREEN("stopBasedRouteSearchScreen"),
    TRIP_PLANNER("tripPlanner"),
    ONDC_STOP_BASED_SEARCH_SCREEN("ondcStopBasedSearchScreen"),
    STOP_FOCUSED_TRIP_PLANNER("stopFocusedTripPlanner"),
    HOME_WORK_SELECTION("homeWorkSelection"),
    HOME_PREFERENCE_SELECTION("surveyHomeSelection"),
    WORK_PREFERECNCE_SELECTION("surveyWorkSelection"),
    UNKNOWN("");

    private final String sourceName;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ll1(24));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/universalsearch/data/UniversalSearchFlowSource$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/universalsearch/data/UniversalSearchFlowSource;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UniversalSearchFlowSource> serializer() {
            return (KSerializer) UniversalSearchFlowSource.$cachedSerializer$delegate.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10135a;

        static {
            int[] iArr = new int[UniversalSearchFlowSource.values().length];
            try {
                iArr[UniversalSearchFlowSource.CITY_SELECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UniversalSearchFlowSource.HOME_SCREEN_MAIN_FRAGMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UniversalSearchFlowSource.HOME_SCREEN_TAB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UniversalSearchFlowSource.NEAR_BY_STOPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UniversalSearchFlowSource.PREMIUM_FROM_STOP_SELECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UniversalSearchFlowSource.PREMIUM_TO_STOP_SELECTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[UniversalSearchFlowSource.REGULAR_BUS_SCREEN_TAB.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[UniversalSearchFlowSource.STOP_BASED_ROUTE_SEARCH_SCREEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[UniversalSearchFlowSource.TRIP_PLANNER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[UniversalSearchFlowSource.ONDC_STOP_BASED_SEARCH_SCREEN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[UniversalSearchFlowSource.STOP_FOCUSED_TRIP_PLANNER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[UniversalSearchFlowSource.HOME_WORK_SELECTION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[UniversalSearchFlowSource.HOME_PREFERENCE_SELECTION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[UniversalSearchFlowSource.WORK_PREFERECNCE_SELECTION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[UniversalSearchFlowSource.UNKNOWN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f10135a = iArr;
        }
    }

    UniversalSearchFlowSource(String str) {
        this.sourceName = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.b("app.chalo.universalsearch.data.UniversalSearchFlowSource", values());
    }

    public static EnumEntries<UniversalSearchFlowSource> getEntries() {
        return $ENTRIES;
    }

    public final String getSourceName() {
        return this.sourceName;
    }

    public final Source toSource() {
        switch (WhenMappings.f10135a[ordinal()]) {
            case 1:
                return Source.CITY_SELECTION_SCREEN;
            case 2:
                return Source.HOME_SCREEN;
            case 3:
                return Source.HOME_SCREEN_TAB;
            case 4:
                return Source.NEARBY_STOPS;
            case 5:
                return Source.PREMIUM_FROM_STOP_SELECTION;
            case 6:
                return Source.PREMIUM_TO_STOP_SELECTION;
            case 7:
                return Source.REGULAR_BUS_SCREEN_TAB;
            case 8:
                return Source.STOP_BASED_ROUTE_SEARCH_SCREEN;
            case 9:
                return Source.TRIP_PLANNER;
            case 10:
                return Source.STOP_BASED_ROUTE_SEARCH_SCREEN;
            case 11:
                return Source.STOP_BASED_TRIP_PLANNER_SEARCH_SCREEN;
            case 12:
                return Source.SAVED_PLACES_AND_RIDES_SCREEN;
            case 13:
            case 14:
                return Source.SURVEY_SCREEN;
            case 15:
                return Source.UNKNOWN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
