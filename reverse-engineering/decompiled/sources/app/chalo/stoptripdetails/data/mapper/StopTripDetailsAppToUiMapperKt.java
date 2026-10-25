package app.chalo.stoptripdetails.data.mapper;

import app.chalo.citydata.data.model.app.TimeTableStatus;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.stoptripdetails.data.model.StopETAModel;
import app.chalo.stoptripdetails.data.model.StopTripDetailsUiModel;
import app.chalo.stoptripdetails.data.model.app.EstimatedTime;
import app.chalo.stoptripdetails.data.model.app.EstimatedTimeType;
import app.chalo.stoptripdetails.data.model.app.StopTripDetailsAppModel;
import defpackage.mb1;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StopTripDetailsAppToUiMapperKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9460a;

        static {
            int[] iArr = new int[EstimatedTimeType.values().length];
            try {
                iArr[EstimatedTimeType.NO_MORE_TRIPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EstimatedTimeType.AFTER_X.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EstimatedTimeType.EVERY_X_MIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EstimatedTimeType.INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EstimatedTimeType.VALID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EstimatedTimeType.VALID_WITH_DISCLAIMER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f9460a = iArr;
        }
    }

    public static final String a(String input) {
        Intrinsics.i(input, "input");
        return CollectionsKt.O(StringsKt.U(input, new String[]{","}, 6), ", ", null, null, new mb1(5), 30);
    }

    public static final StopTripDetailsUiModel b(StopTripDetailsAppModel stopTripDetailsAppModel, EstimatedTime estimatedTime, ChaloTransitMode transitMode, String stopId, String stopName, int i) {
        StopETAModel noMoreTrips;
        Intrinsics.i(stopTripDetailsAppModel, "<this>");
        Intrinsics.i(estimatedTime, "estimatedTime");
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        switch (WhenMappings.f9460a[estimatedTime.b.ordinal()]) {
            case 1:
                noMoreTrips = new StopETAModel.NoMoreTrips(estimatedTime);
                break;
            case 2:
                noMoreTrips = new StopETAModel.AfterXTime(estimatedTime);
                break;
            case 3:
                noMoreTrips = new StopETAModel.FrequencyTrips(estimatedTime);
                break;
            case 4:
                noMoreTrips = new StopETAModel.InvalidTrips(estimatedTime);
                break;
            case 5:
                noMoreTrips = new StopETAModel.FixedTime(estimatedTime);
                break;
            case 6:
                noMoreTrips = new StopETAModel.ValidTripsWithDisclaimer(estimatedTime);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        StopETAModel stopETAModel = noMoreTrips;
        if (stopTripDetailsAppModel instanceof StopTripDetailsAppModel.FixedTime) {
            StopTripDetailsAppModel.FixedTime fixedTime = (StopTripDetailsAppModel.FixedTime) stopTripDetailsAppModel;
            String str = fixedTime.i;
            String str2 = fixedTime.j;
            String str3 = fixedTime.m;
            String str4 = fixedTime.g.b;
            String str5 = fixedTime.h.b;
            List list = fixedTime.k;
            String str6 = fixedTime.o;
            int i2 = fixedTime.p;
            EmptyList emptyList = EmptyList.f17557a;
            TimeTableStatus timeTableStatus = stopTripDetailsAppModel.b;
            String str7 = fixedTime.q;
            return new StopTripDetailsUiModel(stopId, stopName, str, str2, str3, str4, str5, false, list, stopETAModel, str6, emptyList, i2, transitMode, timeTableStatus, str7 != null ? a(str7) : null, fixedTime.r, 73856);
        }
        if (stopTripDetailsAppModel instanceof StopTripDetailsAppModel.FrequencyTrip) {
            StopTripDetailsAppModel.FrequencyTrip frequencyTrip = (StopTripDetailsAppModel.FrequencyTrip) stopTripDetailsAppModel;
            String str8 = frequencyTrip.j;
            String str9 = frequencyTrip.k;
            String str10 = frequencyTrip.n;
            String str11 = frequencyTrip.h.b;
            String str12 = frequencyTrip.i.b;
            List list2 = frequencyTrip.l;
            String str13 = frequencyTrip.p;
            Integer numC = frequencyTrip.c(i);
            int iIntValue = numC != null ? numC.intValue() : 0;
            List list3 = frequencyTrip.f;
            TimeTableStatus timeTableStatus2 = stopTripDetailsAppModel.b;
            String str14 = frequencyTrip.q;
            return new StopTripDetailsUiModel(stopId, stopName, str8, str9, str10, str11, str12, true, list2, stopETAModel, str13, list3, iIntValue, transitMode, timeTableStatus2, str14 != null ? a(str14) : null, frequencyTrip.r, 8320);
        }
        if (!(stopTripDetailsAppModel instanceof StopTripDetailsAppModel.UnknownTiming)) {
            throw new NoWhenBranchMatchedException();
        }
        StopTripDetailsAppModel.UnknownTiming unknownTiming = (StopTripDetailsAppModel.UnknownTiming) stopTripDetailsAppModel;
        String str15 = unknownTiming.i;
        String str16 = unknownTiming.j;
        String str17 = unknownTiming.m;
        String str18 = unknownTiming.g.b;
        String str19 = unknownTiming.h.b;
        List list4 = unknownTiming.k;
        String str20 = unknownTiming.o;
        EmptyList emptyList2 = EmptyList.f17557a;
        TimeTableStatus timeTableStatus3 = stopTripDetailsAppModel.b;
        String str21 = unknownTiming.p;
        return new StopTripDetailsUiModel(stopId, stopName, str15, str16, str17, str18, str19, false, list4, stopETAModel, str20, emptyList2, 0, transitMode, timeTableStatus3, str21 != null ? a(str21) : null, unknownTiming.q, 73856);
    }
}
