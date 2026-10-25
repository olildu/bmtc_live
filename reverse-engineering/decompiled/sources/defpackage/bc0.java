package defpackage;

import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bc0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11185a;
    public final /* synthetic */ List b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ bc0(List list, MutableState mutableState, int i) {
        this.f11185a = i;
        this.b = list;
        this.c = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11185a) {
            case 0:
                boolean zBooleanValue = ((Boolean) this.c.getValue()).booleanValue();
                List list = this.b;
                if (zBooleanValue) {
                    return list;
                }
                String str = (String) CollectionsKt.H(list);
                String str2 = (String) CollectionsKt.Q(list);
                return (str == null || str2 == null) ? EmptyList.f17557a : CollectionsKt.S(str, str2);
            default:
                boolean zBooleanValue2 = ((Boolean) this.c.getValue()).booleanValue();
                List list2 = this.b;
                if (zBooleanValue2) {
                    return list2;
                }
                String str3 = (String) CollectionsKt.H(list2);
                String str4 = (String) CollectionsKt.Q(list2);
                return (str3 == null || str4 == null) ? EmptyList.f17557a : CollectionsKt.S(str3, str4);
        }
    }
}
