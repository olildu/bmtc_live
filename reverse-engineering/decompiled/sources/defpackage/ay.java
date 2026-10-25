package defpackage;

import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.internal.PlatformDefaultTextContextMenuProviders_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.ads.NativeAdViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ay implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11151a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ int d;

    public /* synthetic */ ay(Modifier modifier, Function2 function2, int i, int i2) {
        this.f11151a = i2;
        this.b = modifier;
        this.c = function2;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f11151a;
        Unit unit = Unit.f17538a;
        int i2 = this.d;
        Function2 function2 = this.c;
        Modifier modifier = this.b;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                return DefaultTextContextMenuDropdownProvider_androidKt.ProvideDefaultTextContextMenuDropdown$lambda$1(modifier, function2, i2, composer, num.intValue());
            case 1:
                num.getClass();
                ProvidableCompositionLocal providableCompositionLocal = NativeAdViewKt.f801a;
                NativeAdViewKt.a(modifier, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 2:
                num.getClass();
                ProvidableCompositionLocal providableCompositionLocal2 = NativeAdViewKt.f801a;
                NativeAdViewKt.b(modifier, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            default:
                return PlatformDefaultTextContextMenuProviders_androidKt.ProvideBothDefaultProviders$lambda$5(modifier, function2, i2, composer, num.intValue());
        }
    }
}
