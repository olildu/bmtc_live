package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.dialogs.TncDialogUIKt;
import app.chalo.ncmc.ui.common.CardRechargeTncDialogueKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kf implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17492a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ List c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ int i;

    public /* synthetic */ kf(Modifier modifier, List list, String str, String str2, Function0 function0, String str3, Function0 function1, int i, int i2) {
        this.f17492a = i2;
        this.b = modifier;
        this.c = list;
        this.d = str;
        this.e = str2;
        this.f = function0;
        this.g = str3;
        this.h = function1;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17492a) {
            case 0:
                ((Integer) obj2).getClass();
                CardRechargeTncDialogueKt.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                TncDialogUIKt.c(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.i | 1));
                break;
        }
        return Unit.f17538a;
    }
}
