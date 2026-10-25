package defpackage;

import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider_androidKt;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e5 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15518a;
    public final /* synthetic */ AndroidTextContextMenuToolbarProvider b;

    public /* synthetic */ e5(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, int i) {
        this.f15518a = i;
        this.b = androidTextContextMenuToolbarProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15518a) {
            case 0:
                return AndroidTextContextMenuToolbarProvider.snapshotStateObserver$lambda$0(this.b, (Function0) obj);
            case 1:
                return AndroidTextContextMenuToolbarProvider.onDataChange$lambda$0(this.b, obj);
            case 2:
                return AndroidTextContextMenuToolbarProvider.onPositionChange$lambda$0(this.b, obj);
            default:
                return AndroidTextContextMenuToolbarProvider_androidKt.platformTextContextMenuToolbarProvider$lambda$1$0(this.b, (DisposableEffectScope) obj);
        }
    }
}
