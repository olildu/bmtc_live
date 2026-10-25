package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupProperties;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDefaultLegSectionKt;
import app.chalo.providers.iconassetprovider.IconType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15698a = 2;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ g4(SliderDefaults sliderDefaults, MutableInteractionSource mutableInteractionSource, Modifier modifier, SliderColors sliderColors, boolean z, long j, int i, int i2) {
        this.g = sliderDefaults;
        this.h = mutableInteractionSource;
        this.b = modifier;
        this.i = sliderColors;
        this.c = z;
        this.d = j;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15698a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AndroidMenu_androidKt.DropdownMenu_ILWXrKs$lambda$6(this.c, (Function0) this.g, this.b, this.d, (PopupProperties) this.h, (Function3) this.i, this.e, this.f, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$25((Function2) this.g, this.b, (DrawerState) this.h, this.c, this.d, (Function2) this.i, this.e, this.f, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return SliderDefaults.Thumb_9LiSoMs$lambda$3((SliderDefaults) this.g, (MutableInteractionSource) this.h, this.b, (SliderColors) this.i, this.c, this.d, this.e, this.f, (Composer) obj, iIntValue3);
            default:
                ((Integer) obj2).getClass();
                TripPlannerDefaultLegSectionKt.a((IconType) this.g, (String) this.h, this.c, (Function2) this.i, this.b, this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1), this.f);
                return Unit.f17538a;
        }
    }

    public /* synthetic */ g4(IconType iconType, String str, boolean z, Function2 function2, Modifier modifier, long j, int i, int i2) {
        this.g = iconType;
        this.h = str;
        this.c = z;
        this.i = function2;
        this.b = modifier;
        this.d = j;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ g4(Function2 function2, Modifier modifier, DrawerState drawerState, boolean z, long j, Function2 function3, int i, int i2) {
        this.g = function2;
        this.b = modifier;
        this.h = drawerState;
        this.c = z;
        this.d = j;
        this.i = function3;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ g4(boolean z, Function0 function0, Modifier modifier, long j, PopupProperties popupProperties, Function3 function3, int i, int i2) {
        this.c = z;
        this.g = function0;
        this.b = modifier;
        this.d = j;
        this.h = popupProperties;
        this.i = function3;
        this.e = i;
        this.f = i2;
    }
}
