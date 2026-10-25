package app.chalo.plotline.data.model;

import defpackage.nf1;
import defpackage.r30;
import defpackage.sr;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/plotline/data/model/CustomActionValue;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CustomActionValue {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new sr(24)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionType f6846a;
    public final String b;
    public final String c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/plotline/data/model/CustomActionValue$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/plotline/data/model/CustomActionValue;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CustomActionValue> serializer() {
            return CustomActionValue$$serializer.f6847a;
        }
    }

    public /* synthetic */ CustomActionValue(int i, ActionType actionType, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(CustomActionValue$$serializer.f6847a.getDescriptor(), i, 15);
            throw null;
        }
        this.f6846a = actionType;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomActionValue)) {
            return false;
        }
        CustomActionValue customActionValue = (CustomActionValue) obj;
        return this.f6846a == customActionValue.f6846a && Intrinsics.d(this.b, customActionValue.b) && Intrinsics.d(this.c, customActionValue.c) && Intrinsics.d(this.d, customActionValue.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nf1.e(nf1.e(this.f6846a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomActionValue(actionType=");
        sb.append(this.f6846a);
        sb.append(", preUrlMessage=");
        sb.append(this.b);
        sb.append(", postUrlMessage=");
        return r30.i(sb, this.c, ", url=", this.d, ")");
    }
}
