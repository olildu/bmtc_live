package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.WideNavigationRailColors;
import androidx.compose.material3.WideNavigationRailKt;
import androidx.compose.material3.WideNavigationRailState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import app.chalo.compose.SearchFieldWithSwapButtonCardKt;
import app.chalo.home.ui.compose.CommonTemplateBottomSheetKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDefaultLegCardKt;
import app.chalo.providers.iconassetprovider.IconType;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kq implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18248a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ kq(Modifier modifier, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Function function, int i, int i2, int i3) {
        this.f18248a = i3;
        this.b = modifier;
        this.j = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.k = function;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18248a) {
            case 0:
                ((Integer) obj2).getClass();
                CommonTemplateBottomSheetKt.a(this.b, (IconType) this.j, (String) this.c, (String) this.d, (String) this.e, (String) this.f, (Function0) this.g, (Function0) this.k, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.h | 1), this.i);
                return Unit.f17538a;
            case 1:
                ((Integer) obj2).getClass();
                SearchFieldWithSwapButtonCardKt.d(this.b, (String) this.c, (String) this.d, (String) this.e, (String) this.f, (Function1) this.j, (Function0) this.g, (TextStyle) this.k, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.h | 1), RecomposeScopeImplKt.updateChangedFlags(this.i));
                return Unit.f17538a;
            case 2:
                ((Integer) obj2).getClass();
                TripPlannerDefaultLegCardKt.a((String) this.c, (String) this.d, (String) this.e, (String) this.f, this.b, (IconType) this.j, this.h, (String) this.k, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.i | 1));
                return Unit.f17538a;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return WideNavigationRailKt.WideNavigationRail$lambda$1(this.b, (WideNavigationRailState) this.j, (Shape) this.c, (WideNavigationRailColors) this.d, (Function2) this.e, (WindowInsets) this.f, (Arrangement.Vertical) this.g, (Function2) this.k, this.h, this.i, (Composer) obj, iIntValue);
        }
    }

    public /* synthetic */ kq(Modifier modifier, String str, String str2, String str3, String str4, Function1 function1, Function0 function0, TextStyle textStyle, int i, int i2) {
        this.f18248a = 1;
        this.b = modifier;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.j = function1;
        this.g = function0;
        this.k = textStyle;
        this.h = i;
        this.i = i2;
    }

    public /* synthetic */ kq(String str, String str2, String str3, String str4, Modifier modifier, IconType iconType, int i, String str5, Function0 function0, int i2) {
        this.f18248a = 2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.b = modifier;
        this.j = iconType;
        this.h = i;
        this.k = str5;
        this.g = function0;
        this.i = i2;
    }
}
