package defpackage;

import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.internal.PlatformDefaultTextContextMenuProviders_androidKt;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.ads.NativeAdViewKt;
import app.chalo.ncmc.ui.landing.compose.ChaloCardComposeItemsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f5 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15611a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ f5(Modifier modifier, Function2 function2, int i, int i2, int i3) {
        this.f15611a = i3;
        this.b = modifier;
        this.c = function2;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f15611a;
        Unit unit = Unit.f17538a;
        int i2 = this.e;
        int i3 = this.d;
        Function2 function2 = this.c;
        Modifier modifier = this.b;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AndroidTextContextMenuToolbarProvider_androidKt.ProvidePlatformTextContextMenuToolbar$lambda$0(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue);
            case 1:
                ((Integer) obj2).getClass();
                ChaloCardComposeItemsKt.b(modifier, function2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), (Composer) obj, i2);
                return unit;
            case 2:
                ((Integer) obj2).getClass();
                ProvidableCompositionLocal providableCompositionLocal = NativeAdViewKt.f801a;
                NativeAdViewKt.d(modifier, function2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), (Composer) obj, i2);
                return unit;
            case 3:
                int iIntValue2 = ((Integer) obj2).intValue();
                return PlatformDefaultTextContextMenuProviders_androidKt.ProvideDefaultPlatformTextContextMenuProviders$lambda$1(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue2);
            case 4:
                int iIntValue3 = ((Integer) obj2).intValue();
                return SelectionContainerKt.SelectionContainer$lambda$4(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return SimpleLayoutKt.SimpleLayout$lambda$1(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue4);
        }
    }
}
