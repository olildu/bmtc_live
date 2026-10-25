package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.ncmc.ui.landing.compose.ChaloCardComposablesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ki implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17501a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;

    public /* synthetic */ ki(String str, String str2, String str3, Function0 function0, int i, int i2) {
        this.f17501a = i2;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = function0;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17501a) {
            case 0:
                ((Integer) obj2).intValue();
                ChaloCardComposablesKt.b(this.b, this.c, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ChaloCardComposablesKt.a(this.b, this.c, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                break;
        }
        return Unit.f17538a;
    }
}
