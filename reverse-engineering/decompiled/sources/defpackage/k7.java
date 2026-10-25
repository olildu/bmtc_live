package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k7 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17471a;
    public final /* synthetic */ Alignment.Horizontal b;

    public /* synthetic */ k7(Alignment.Horizontal horizontal, int i) {
        this.f17471a = i;
        this.b = horizontal;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17471a) {
            case 0:
                return Integer.valueOf(Arrangement.spacedBy_D5KLDUw$lambda$0(this.b, ((Integer) obj).intValue(), (LayoutDirection) obj2));
            case 1:
                return Integer.valueOf(Arrangement.aligned$lambda$0(this.b, ((Integer) obj).intValue(), (LayoutDirection) obj2));
            case 2:
                return Integer.valueOf(Arrangement.Absolute.aligned$lambda$0(this.b, ((Integer) obj).intValue(), (LayoutDirection) obj2));
            case 3:
                return Integer.valueOf(Arrangement.Absolute.spacedBy_D5KLDUw$lambda$0(this.b, ((Integer) obj).intValue(), (LayoutDirection) obj2));
            default:
                return WrapContentElement.Companion.width$lambda$0(this.b, (IntSize) obj, (LayoutDirection) obj2);
        }
    }
}
