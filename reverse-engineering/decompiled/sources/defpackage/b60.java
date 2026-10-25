package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import app.chalo.compose.StandardErrorScreenKt;
import app.chalo.compose.components.GenericScreenWithCtaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b60 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11170a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ Painter d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    public /* synthetic */ b60(Modifier modifier, Modifier modifier2, Painter painter, String str, String str2, String str3, boolean z, Function0 function0, int i, int i2, int i3) {
        this.f11170a = i3;
        this.b = modifier;
        this.c = modifier2;
        this.d = painter;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = z;
        this.i = function0;
        this.j = i;
        this.k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11170a) {
            case 0:
                ((Integer) obj2).getClass();
                GenericScreenWithCtaKt.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.j | 1), this.k);
                break;
            default:
                ((Integer) obj2).getClass();
                StandardErrorScreenKt.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.j | 1), this.k);
                break;
        }
        return Unit.f17538a;
    }
}
