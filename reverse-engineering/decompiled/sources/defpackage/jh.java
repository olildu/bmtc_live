package defpackage;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material3.SwitchColors;
import androidx.compose.material3.SwitchKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import app.chalo.home.data.model.PremiumPassSavingsInfo;
import app.chalo.home.ui.chalobus.ChaloBusScreenHeaderLayoutKt;
import app.chalo.homescreen.data.model.app.ChaloBusHeaderAppModel;
import app.chalo.instantticket.ui.faredetails.compose.FareDetailsCTAViewKt;
import app.chalo.ncmc.ui.landing.compose.SingleCardDetailsScreenKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jh implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17405a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ jh(Modifier modifier, String str, String str2, boolean z, boolean z2, String str3, Function1 function1, int i) {
        this.f = modifier;
        this.c = str;
        this.g = str2;
        this.b = z;
        this.d = z2;
        this.h = str3;
        this.i = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17405a) {
            case 0:
                ((Integer) obj2).intValue();
                ChaloBusScreenHeaderLayoutKt.d((String) this.c, (ChaloBusHeaderAppModel) this.f, (PremiumPassSavingsInfo) this.g, this.b, (List) this.h, this.d, (Function1) this.i, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                return Unit.f17538a;
            case 1:
                ((Integer) obj2).getClass();
                FareDetailsCTAViewKt.a((Modifier) this.f, this.b, (String) this.c, (String) this.g, this.d, (Function0) this.h, (Function0) this.i, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                return Unit.f17538a;
            case 2:
                ((Integer) obj2).getClass();
                SingleCardDetailsScreenKt.a((Modifier) this.f, (String) this.c, (String) this.g, this.b, this.d, (String) this.h, (Function1) this.i, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                return Unit.f17538a;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return SwitchKt.SwitchImpl$lambda$4((Modifier) this.c, this.b, this.d, (SwitchColors) this.f, (Function2) this.g, (InteractionSource) this.h, (Shape) this.i, this.e, (Composer) obj, iIntValue);
        }
    }

    public /* synthetic */ jh(Modifier modifier, boolean z, String str, String str2, boolean z2, Function0 function0, Function0 function1, int i) {
        this.f = modifier;
        this.b = z;
        this.c = str;
        this.g = str2;
        this.d = z2;
        this.h = function0;
        this.i = function1;
        this.e = i;
    }

    public /* synthetic */ jh(Modifier modifier, boolean z, boolean z2, SwitchColors switchColors, Function2 function2, InteractionSource interactionSource, Shape shape, int i) {
        this.c = modifier;
        this.b = z;
        this.d = z2;
        this.f = switchColors;
        this.g = function2;
        this.h = interactionSource;
        this.i = shape;
        this.e = i;
    }

    public /* synthetic */ jh(String str, ChaloBusHeaderAppModel chaloBusHeaderAppModel, PremiumPassSavingsInfo premiumPassSavingsInfo, boolean z, List list, boolean z2, Function1 function1, int i) {
        this.c = str;
        this.f = chaloBusHeaderAppModel;
        this.g = premiumPassSavingsInfo;
        this.b = z;
        this.h = list;
        this.d = z2;
        this.i = function1;
        this.e = i;
    }
}
