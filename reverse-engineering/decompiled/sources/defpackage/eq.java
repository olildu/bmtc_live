package defpackage;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.text.CommonContextMenuAreaKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eq implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15578a;
    public final /* synthetic */ ContextMenuState b;

    public /* synthetic */ eq(ContextMenuState contextMenuState, int i) {
        this.f15578a = i;
        this.b = contextMenuState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15578a) {
            case 0:
                return CommonContextMenuAreaKt.CommonContextMenuArea$lambda$2$0(this.b);
            case 1:
                return CommonContextMenuAreaKt.CommonContextMenuArea$lambda$13$0(this.b);
            default:
                return CommonContextMenuAreaKt.CommonContextMenuArea$lambda$9$0(this.b);
        }
    }
}
