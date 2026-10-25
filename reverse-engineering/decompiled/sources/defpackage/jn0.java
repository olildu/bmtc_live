package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.home.ui.compose.NotificationPermissionBottomSheetKt;
import app.chalo.premiumbus.prebookedtickets.cancellationack.PremiumBusInAppCommunicationBottomSheetScreenKt;
import app.chalo.providers.iconassetprovider.IconType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jn0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17422a = 0;
    public final /* synthetic */ IconType b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Modifier i;
    public final /* synthetic */ int j;

    public /* synthetic */ jn0(Modifier modifier, IconType iconType, String str, String str2, String str3, String str4, Function0 function0, Function0 function1, int i) {
        this.i = modifier;
        this.b = iconType;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = function0;
        this.h = function1;
        this.j = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17422a) {
            case 0:
                ((Integer) obj2).getClass();
                NotificationPermissionBottomSheetKt.a(RecomposeScopeImplKt.updateChangedFlags(this.j | 1), (Composer) obj, this.i, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                PremiumBusInAppCommunicationBottomSheetScreenKt.a(RecomposeScopeImplKt.updateChangedFlags(this.j | 1), (Composer) obj, this.i, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ jn0(IconType iconType, String str, String str2, String str3, String str4, Function0 function0, Function0 function1, Modifier modifier, int i) {
        this.b = iconType;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = function0;
        this.h = function1;
        this.i = modifier;
        this.j = i;
    }
}
