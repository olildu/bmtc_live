package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.home.ui.profile.ProfilePageDisplayItemData;
import app.chalo.home.ui.profile.ProfileScreenUIKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fy0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15685a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ ProfilePageDisplayItemData d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ fy0(Modifier modifier, Function1 function1, ProfilePageDisplayItemData profilePageDisplayItemData, int i, int i2, int i3) {
        this.f15685a = i3;
        this.b = modifier;
        this.c = function1;
        this.d = profilePageDisplayItemData;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15685a) {
            case 0:
                ((Integer) obj2).intValue();
                ProfileScreenUIKt.e(this.b, this.c, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ProfileScreenUIKt.e(this.b, this.c, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                ProfileScreenUIKt.f(this.b, this.c, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                ProfileScreenUIKt.d(this.b, this.c, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ProfileScreenUIKt.d(this.b, this.c, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                break;
        }
        return Unit.f17538a;
    }
}
