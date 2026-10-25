package defpackage;

import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Transformations;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vk1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19846a;
    public final /* synthetic */ MediatorLiveData b;

    public /* synthetic */ vk1(MediatorLiveData mediatorLiveData, int i) {
        this.f19846a = i;
        this.b = mediatorLiveData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19846a) {
            case 0:
                return Transformations.switchMap$lambda$3$lambda$2(this.b, obj);
            default:
                return Transformations.AnonymousClass2.onChanged$lambda$0(this.b, obj);
        }
    }
}
