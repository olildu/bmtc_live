package defpackage;

import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d5 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15429a;
    public final /* synthetic */ AndroidTextContextMenuToolbarProvider b;
    public final /* synthetic */ TextContextMenuDataProvider c;

    public /* synthetic */ d5(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, TextContextMenuDataProvider textContextMenuDataProvider, int i) {
        this.f15429a = i;
        this.b = androidTextContextMenuToolbarProvider;
        this.c = textContextMenuDataProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15429a) {
            case 0:
                return this.b.observeAndGetData(this.c);
            case 1:
                return this.b.observeAndGetBounds(this.c);
            default:
                return this.b.calculateBoundsInRoot(this.c);
        }
    }
}
