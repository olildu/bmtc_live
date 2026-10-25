package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.MenuItemColors;
import androidx.compose.material3.NavigationDrawerItemColors;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import app.chalo.instantticket.ui.faredetails.compose.FareRouteAndStopDetailsViewKt;
import app.chalo.providers.RouteNamingSchemeType;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15608a = 3;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ f4(RangeSliderState rangeSliderState, Modifier modifier, boolean z, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Function3 function3, Function3 function4, Function3 function5, int i, int i2) {
        this.f = rangeSliderState;
        this.b = modifier;
        this.c = z;
        this.g = sliderColors;
        this.l = mutableInteractionSource;
        this.h = mutableInteractionSource2;
        this.i = function3;
        this.j = function4;
        this.k = function5;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15608a) {
            case 0:
                return AndroidMenu_androidKt.DropdownMenuItem$lambda$7((Function2) this.f, (Function0) this.i, this.b, (Function2) this.g, (Function2) this.h, this.c, (MenuItemColors) this.j, (PaddingValues) this.k, (MutableInteractionSource) this.l, this.d, this.e, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                ((Integer) obj2).getClass();
                FareRouteAndStopDetailsViewKt.b(this.b, (String) this.f, (List) this.g, (String) this.h, (String) this.i, (String) this.j, (String) this.k, (RouteNamingSchemeType) this.l, this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1), this.e);
                return Unit.f17538a;
            case 2:
                return NavigationDrawerKt.NavigationDrawerItem$lambda$65((Function2) this.f, this.c, (Function0) this.i, this.b, (Function2) this.g, (Function2) this.h, (Shape) this.j, (NavigationDrawerItemColors) this.k, (MutableInteractionSource) this.l, this.d, this.e, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return SliderKt.RangeSlider$lambda$23((RangeSliderState) this.f, this.b, this.c, (SliderColors) this.g, (MutableInteractionSource) this.l, (MutableInteractionSource) this.h, (Function3) this.i, (Function3) this.j, (Function3) this.k, this.d, this.e, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ f4(Modifier modifier, String str, List list, String str2, String str3, String str4, String str5, RouteNamingSchemeType routeNamingSchemeType, boolean z, int i, int i2) {
        this.b = modifier;
        this.f = str;
        this.g = list;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = routeNamingSchemeType;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ f4(Function2 function2, Function0 function0, Modifier modifier, Function2 function3, Function2 function4, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.f = function2;
        this.i = function0;
        this.b = modifier;
        this.g = function3;
        this.h = function4;
        this.c = z;
        this.j = menuItemColors;
        this.k = paddingValues;
        this.l = mutableInteractionSource;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ f4(Function2 function2, boolean z, Function0 function0, Modifier modifier, Function2 function3, Function2 function4, Shape shape, NavigationDrawerItemColors navigationDrawerItemColors, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.f = function2;
        this.c = z;
        this.i = function0;
        this.b = modifier;
        this.g = function3;
        this.h = function4;
        this.j = shape;
        this.k = navigationDrawerItemColors;
        this.l = mutableInteractionSource;
        this.d = i;
        this.e = i2;
    }
}
