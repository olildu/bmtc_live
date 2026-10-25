package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.home.ui.regularbus.compose.RegularBusScreenUIKt;
import app.chalo.providers.iconassetprovider.IconType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w11 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19884a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ IconType e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ int g;

    public /* synthetic */ w11(String str, String str2, String str3, IconType iconType, Modifier modifier, int i, int i2) {
        this.f19884a = i2;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = iconType;
        this.f = modifier;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19884a) {
            case 0:
                ((Integer) obj2).getClass();
                RegularBusScreenUIKt.m(this.b, this.c, this.d, this.e, this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.g | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                RegularBusScreenUIKt.n(this.b, this.c, this.d, this.e, this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.g | 1));
                break;
        }
        return Unit.f17538a;
    }
}
