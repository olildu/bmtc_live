package defpackage;

import androidx.compose.runtime.ComposerImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yr implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20137a;
    public final /* synthetic */ ComposerImpl b;

    public /* synthetic */ yr(ComposerImpl composerImpl, int i) {
        this.f20137a = i;
        this.b = composerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20137a) {
            case 0:
                break;
        }
        return this.b.currentStackTrace();
    }
}
