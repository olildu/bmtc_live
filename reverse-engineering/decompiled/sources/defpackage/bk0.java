package defpackage;

import androidx.compose.material3.carousel.KeylineList;
import androidx.compose.material3.carousel.KeylineListScope;
import androidx.compose.material3.carousel.StrategyKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bk0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11205a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bk0(Object obj, int i, int i2, int i3) {
        this.f11205a = i3;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11205a) {
            case 0:
                return MultiParagraph.getPathForRange$lambda$1((Path) this.d, this.b, this.c, (ParagraphInfo) obj);
            default:
                return StrategyKt.moveKeylineAndCreateShiftedKeylineList$lambda$5((KeylineList) this.d, this.b, this.c, (KeylineListScope) obj);
        }
    }
}
