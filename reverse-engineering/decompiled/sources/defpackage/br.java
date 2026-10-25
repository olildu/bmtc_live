package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerFormatter;
import androidx.compose.material3.DateRangePickerKt;
import androidx.compose.material3.SelectableDates;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import app.chalo.premiumbus.ui.stopselection.compose.PbLandingScreenRouteSearchKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class br implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11223a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ br(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, int i, int i2) {
        this.f11223a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.h = obj6;
        this.i = obj7;
        this.j = obj8;
        this.k = obj9;
        this.l = obj10;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11223a) {
            case 0:
                return ComposableLambdaImpl.invoke$lambda$8((ComposableLambdaImpl) this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.b, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return DateRangePickerKt.VerticalMonthsList$lambda$15((LazyListState) this.c, (Long) this.d, (Long) this.e, (Function2) this.f, (Function1) this.g, (CalendarModel) this.h, (IntRange) this.i, (DatePickerFormatter) this.j, (SelectableDates) this.k, (DatePickerColors) this.l, this.b, (Composer) obj, ((Integer) obj2).intValue());
            default:
                ((Integer) obj2).getClass();
                PbLandingScreenRouteSearchKt.b((Modifier) this.c, (String) this.d, (AnnotatedString) this.e, (String) this.f, (String) this.g, (AnnotatedString) this.h, (String) this.i, (Function1) this.j, (Function0) this.k, (TextStyle) this.l, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
        }
    }
}
