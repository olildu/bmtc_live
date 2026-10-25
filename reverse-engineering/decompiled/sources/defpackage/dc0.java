package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.ItineraryLegStopListSectionKt;
import app.chalo.validationsdk.blevalidation.ui.common.JourneyDetailsBottomSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dc0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15447a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Modifier i;
    public final /* synthetic */ TextStyle j;
    public final /* synthetic */ int k;
    public final /* synthetic */ String l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    public /* synthetic */ dc0(String str, int i, String str2, String str3, boolean z, boolean z2, Function0 function0, Modifier modifier, TextStyle textStyle, int i2, String str4, int i3, int i4, int i5) {
        this.f15447a = i5;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = z2;
        this.h = function0;
        this.i = modifier;
        this.j = textStyle;
        this.k = i2;
        this.l = str4;
        this.m = i3;
        this.n = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        switch (this.f15447a) {
            case 0:
                ((Integer) obj2).getClass();
                ItineraryLegStopListSectionKt.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, composer, RecomposeScopeImplKt.updateChangedFlags(this.m | 1), RecomposeScopeImplKt.updateChangedFlags(this.n));
                break;
            default:
                ((Integer) obj2).getClass();
                JourneyDetailsBottomSheetKt.h(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, composer, RecomposeScopeImplKt.updateChangedFlags(this.m | 1), RecomposeScopeImplKt.updateChangedFlags(this.n));
                break;
        }
        return Unit.f17538a;
    }
}
