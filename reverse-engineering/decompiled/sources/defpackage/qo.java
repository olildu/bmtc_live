package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.ChipBorder;
import androidx.compose.material3.ChipColors;
import androidx.compose.material3.ChipElevation;
import androidx.compose.material3.ChipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.wallet.ui.access.WalletAccessBaseScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qo implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19139a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    public /* synthetic */ qo(Function0 function0, Function2 function2, Modifier modifier, boolean z, Function2 function3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3) {
        this.f19139a = i3;
        this.b = function0;
        this.c = function2;
        this.d = modifier;
        this.e = z;
        this.f = function3;
        this.g = shape;
        this.h = chipColors;
        this.i = chipElevation;
        this.j = chipBorder;
        this.k = mutableInteractionSource;
        this.l = i;
        this.m = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19139a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ChipKt.ElevatedSuggestionChip$lambda$14(this.b, (Function2) this.c, this.d, this.e, (Function2) this.f, (Shape) this.g, (ChipColors) this.h, (ChipElevation) this.i, (ChipBorder) this.j, (MutableInteractionSource) this.k, this.l, this.m, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ChipKt.SuggestionChip$lambda$11(this.b, (Function2) this.c, this.d, this.e, (Function2) this.f, (Shape) this.g, (ChipColors) this.h, (ChipElevation) this.i, (ChipBorder) this.j, (MutableInteractionSource) this.k, this.l, this.m, (Composer) obj, iIntValue2);
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.l | 1);
                WalletAccessBaseScreenKt.f(this.e, (IconType) this.c, (String) this.f, (String) this.g, (String) this.h, this.b, this.d, (String) this.i, (Function0) this.j, (Function0) this.k, (Composer) obj, iUpdateChangedFlags, this.m);
                return Unit.f17538a;
        }
    }

    public /* synthetic */ qo(boolean z, IconType iconType, String str, String str2, String str3, Function0 function0, Modifier modifier, String str4, Function0 function1, Function0 function2, int i, int i2) {
        this.f19139a = 2;
        this.e = z;
        this.c = iconType;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.b = function0;
        this.d = modifier;
        this.i = str4;
        this.j = function1;
        this.k = function2;
        this.l = i;
        this.m = i2;
    }
}
