package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l7 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18286a;
    public final /* synthetic */ Alignment.Vertical b;

    public /* synthetic */ l7(Alignment.Vertical vertical, int i) {
        this.f18286a = i;
        this.b = vertical;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18286a) {
            case 0:
                return Integer.valueOf(Arrangement.spacedBy_D5KLDUw$lambda$1(this.b, ((Integer) obj).intValue(), (LayoutDirection) obj2));
            case 1:
                return Integer.valueOf(Arrangement.aligned$lambda$1(this.b, ((Integer) obj).intValue(), (LayoutDirection) obj2));
            case 2:
                return Integer.valueOf(Arrangement.Absolute.spacedBy_D5KLDUw$lambda$1(this.b, ((Integer) obj).intValue(), (LayoutDirection) obj2));
            default:
                return WrapContentElement.Companion.height$lambda$0(this.b, (IntSize) obj, (LayoutDirection) obj2);
        }
    }
}
