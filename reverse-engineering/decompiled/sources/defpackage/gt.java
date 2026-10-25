package defpackage;

import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gt implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15764a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ gt(int i, Function0 function0, boolean z) {
        this.f15764a = i;
        this.b = z;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15764a) {
            case 0:
                return ContextMenuUiKt.ContextMenuItem$lambda$0$0(this.b, this.c);
            case 1:
                if (!this.b) {
                    this.c.invoke();
                }
                return Unit.f17538a;
            default:
                if (!this.b) {
                    this.c.invoke();
                }
                return Unit.f17538a;
        }
    }
}
