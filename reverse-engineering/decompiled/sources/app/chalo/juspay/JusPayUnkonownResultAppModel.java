package app.chalo.juspay;

import defpackage.uc0;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/juspay/JusPayUnkonownResultAppModel;", "Lapp/chalo/juspay/JusPayResultAppModel;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class JusPayUnkonownResultAppModel extends JusPayResultAppModel {
    public static final JusPayUnkonownResultAppModel INSTANCE = new JusPayUnkonownResultAppModel();
    public static final /* synthetic */ Object b;

    static {
        JusPayAction.Companion companion = JusPayAction.INSTANCE;
        b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new uc0(22));
    }

    @Override // app.chalo.juspay.JusPayResultAppModel
    /* JADX INFO: renamed from: a */
    public final String getB() {
        return "";
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof JusPayUnkonownResultAppModel);
    }

    public final int hashCode() {
        return 652152876;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final KSerializer<JusPayUnkonownResultAppModel> serializer() {
        return (KSerializer) b.getValue();
    }

    public final String toString() {
        return "JusPayUnkonownResultAppModel";
    }
}
