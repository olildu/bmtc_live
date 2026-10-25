package defpackage;

import androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt;
import com.amazon.aps.shared.util.ApsAsyncUtil;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h7 implements ApsAsyncUtil.ApsReturnRunnable, ReadOnlyProperty {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f15797a;

    public /* synthetic */ h7(Object obj) {
        this.f15797a = obj;
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public Object getValue(Object obj, KProperty kProperty) {
        return SavedStateHandleSaverKt.saveable$lambda$3$lambda$2(this.f15797a, obj, kProperty);
    }

    @Override // com.amazon.aps.shared.util.ApsAsyncUtil.ApsReturnRunnable
    public Object run() {
        return ApsAsyncUtil.lambda$runOnUiThreadAndAsyncCallback$0(this.f15797a);
    }
}
