package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KType;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class or0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18667a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ or0(int i, ArrayList arrayList) {
        this.f18667a = i;
        this.b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18667a) {
            case 0:
                return Integer.valueOf(this.b.size());
            case 1:
                return ((KType) this.b.get(0)).getF17621a();
            default:
                ArrayList arrayList = this.b;
                if (arrayList.isEmpty()) {
                    return EmptyList.f17557a;
                }
                return arrayList.subList((((CharSequence) CollectionsKt.F(arrayList)).length() != 0 || arrayList.size() <= 1) ? 0 : 1, ((CharSequence) CollectionsKt.P(arrayList)).length() == 0 ? CollectionsKt.K(arrayList) : 1 + CollectionsKt.K(arrayList));
        }
    }
}
