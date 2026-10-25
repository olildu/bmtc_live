package defpackage;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yo0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20129a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;

    public /* synthetic */ yo0(float f, float f2, float f3, float f4, int i) {
        this.f20129a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20129a) {
            case 0:
                return PaddingKt.padding_qDBjuR0$lambda$0(this.b, this.c, this.d, this.e, (InspectorInfo) obj);
            default:
                return PaddingKt.absolutePadding_qDBjuR0$lambda$0(this.b, this.c, this.d, this.e, (InspectorInfo) obj);
        }
    }
}
