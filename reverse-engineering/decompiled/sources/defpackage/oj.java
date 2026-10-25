package defpackage;

import androidx.compose.foundation.text.input.TextFieldStateKt;
import app.chalo.extensions.KotlinDateTimeExtensionsKt;
import kotlin.jvm.functions.Function0;
import kotlinx.datetime.LocalDateTime;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class oj implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18603a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ oj(long j, String str, int i) {
        this.f18603a = i;
        this.b = j;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18603a) {
            case 0:
                return KotlinDateTimeExtensionsKt.b(LocalDateTime.INSTANCE, this.b, this.c);
            case 1:
                return KotlinDateTimeExtensionsKt.b(LocalDateTime.INSTANCE, this.b, this.c);
            default:
                return TextFieldStateKt.rememberTextFieldState_Le_punE$lambda$0$0(this.c, this.b);
        }
    }

    public /* synthetic */ oj(String str, long j) {
        this.f18603a = 2;
        this.c = str;
        this.b = j;
    }
}
