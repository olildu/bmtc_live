package defpackage;

import androidx.compose.foundation.text.selection.SelectionRegistrar;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fa implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15622a;
    public final /* synthetic */ SelectionRegistrar b;

    public /* synthetic */ fa(SelectionRegistrar selectionRegistrar, int i) {
        this.f15622a = i;
        this.b = selectionRegistrar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long jNextSelectableId;
        switch (this.f15622a) {
            case 0:
                jNextSelectableId = this.b.nextSelectableId();
                break;
            default:
                jNextSelectableId = this.b.nextSelectableId();
                break;
        }
        return Long.valueOf(jNextSelectableId);
    }
}
