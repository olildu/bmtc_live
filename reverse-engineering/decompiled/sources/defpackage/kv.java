package defpackage;

import androidx.compose.material3.DateInputKt;
import androidx.compose.material3.DateInputValidator;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.SelectableDates;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.runtime.MutableState;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultIntent;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel;
import java.io.Serializable;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kv implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18258a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ kv(DateInputValidator dateInputValidator, CalendarModel calendarModel, DateInputFormat dateInputFormat, Locale locale, int i, MutableState mutableState) {
        this.d = dateInputValidator;
        this.e = calendarModel;
        this.f = dateInputFormat;
        this.c = locale;
        this.b = i;
        this.g = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18258a) {
            case 0:
                return DateInputKt.DateInputTextField_xJ3Ic0Y$lambda$9$lambda$8((DateInputValidator) this.d, (CalendarModel) this.e, (DateInputFormat) this.f, (Locale) this.c, this.b, (MutableState) this.g);
            case 1:
                return DatePickerKt.rememberDatePickerState_EU0dCGE$lambda$5$lambda$4((Long) this.d, (Long) this.e, (IntRange) this.f, this.b, (SelectableDates) this.g, (Locale) this.c);
            default:
                ((Function1) this.d).invoke(new StopTripPlannerResultIntent.ItineraryLegClickedIntent((TripPlannerItineraryAppResponseModel) this.e, (TripPlannerLegAppModel.Bus) this.f, this.b, (Pair) this.c, (Pair) this.g));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ kv(Long l, Long l2, IntRange intRange, int i, SelectableDates selectableDates, Locale locale) {
        this.d = l;
        this.e = l2;
        this.f = intRange;
        this.b = i;
        this.g = selectableDates;
        this.c = locale;
    }

    public /* synthetic */ kv(Function1 function1, TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel, TripPlannerLegAppModel.Bus bus, int i, Pair pair, Pair pair2) {
        this.d = function1;
        this.e = tripPlannerItineraryAppResponseModel;
        this.f = bus;
        this.b = i;
        this.c = pair;
        this.g = pair2;
    }
}
