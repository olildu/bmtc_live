package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g21 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15695a;
    public final /* synthetic */ Saver b;

    public /* synthetic */ g21(Saver saver, int i) {
        this.f15695a = i;
        this.b = saver;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SaverScope saverScope = (SaverScope) obj;
        MutableState mutableState = (MutableState) obj2;
        switch (this.f15695a) {
            case 0:
                return RememberSaveableKt.mutableStateSaver$lambda$0$0(this.b, saverScope, mutableState);
            default:
                return SavedStateHandleSaverKt.mutableStateSaver$lambda$7$lambda$6(this.b, saverScope, mutableState);
        }
    }
}
