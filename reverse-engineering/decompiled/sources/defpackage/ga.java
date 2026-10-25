package defpackage;

import androidx.compose.foundation.text.BasicText_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import in.juspay.hypersdk.core.SdkTracker;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ga implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15712a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ CharSequence e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ga(Object obj, Object obj2, Object obj3, CharSequence charSequence, Object obj4, Object obj5, int i) {
        this.f15712a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = charSequence;
        this.f = obj4;
        this.g = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15712a) {
            case 0:
                BasicText_androidKt.BackgroundTextMeasurement$lambda$1$0((TextStyle) this.b, (LayoutDirection) this.c, (List) this.d, (AnnotatedString) this.e, (Density) this.f, (FontFamily.Resolver) this.g);
                break;
            case 1:
                ((SdkTracker) this.b).lambda$trackException$13((String) this.c, (String) this.d, (String) this.e, (String) this.f, (Throwable) this.g);
                break;
            default:
                SdkTracker.lambda$trackAndLogBootException$5((String) this.b, (String) this.c, (Throwable) this.d, (String) this.e, (String) this.f, (String) this.g);
                break;
        }
    }
}
