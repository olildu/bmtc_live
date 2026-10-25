package defpackage;

import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.MovableContentKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function6;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vj0 implements Function6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19842a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vj0(Object obj, int i) {
        this.f19842a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        switch (this.f19842a) {
            case 0:
                return MovableContentKt.movableContentWithReceiverOf$lambda$7((MovableContent) this.b, obj, obj2, obj3, obj4, (Composer) obj5, ((Integer) obj6).intValue());
            case 1:
                return MovableContentKt.movableContentOf$lambda$7((MovableContent) this.b, obj, obj2, obj3, obj4, (Composer) obj5, ((Integer) obj6).intValue());
            default:
                return Boolean.valueOf(SelectionManager._init_$lambda$3((SelectionManager) this.b, ((Boolean) obj).booleanValue(), (LayoutCoordinates) obj2, (Offset) obj3, (Offset) obj4, ((Boolean) obj5).booleanValue(), (SelectionAdjustment) obj6));
        }
    }
}
