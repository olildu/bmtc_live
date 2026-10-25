package defpackage;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.material3.SearchBarDefaults;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h11 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15783a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ h11(String str, Function1 function1) {
        this.c = str;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15783a) {
            case 0:
                Map scanAndPayProperties = (Map) obj;
                Intrinsics.i(scanAndPayProperties, "$this$scanAndPayProperties");
                scanAndPayProperties.put("scanAndPayOutcome", this.c);
                this.b.invoke(scanAndPayProperties);
                return Unit.f17538a;
            default:
                return SearchBarDefaults.InputField$lambda$42$lambda$41(this.b, this.c, (KeyboardActionScope) obj);
        }
    }

    public /* synthetic */ h11(Function1 function1, String str) {
        this.b = function1;
        this.c = str;
    }
}
