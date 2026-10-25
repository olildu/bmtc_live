package app.chalo.homescreen.data.model.app;

import app.chalo.providers.iconassetprovider.IconType;
import defpackage.vo1;
import defpackage.xe;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/CardSectionAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CardSectionAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xe(19)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3719a;
    public final IconType b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/CardSectionAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/CardSectionAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CardSectionAppModel> serializer() {
            return CardSectionAppModel$$serializer.f3720a;
        }
    }

    public /* synthetic */ CardSectionAppModel(int i, IconType iconType, String str, String str2) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.b(CardSectionAppModel$$serializer.f3720a.getDescriptor(), i, 1);
            throw null;
        }
        this.f3719a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = iconType;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardSectionAppModel)) {
            return false;
        }
        CardSectionAppModel cardSectionAppModel = (CardSectionAppModel) obj;
        return Intrinsics.d(this.f3719a, cardSectionAppModel.f3719a) && this.b == cardSectionAppModel.b && Intrinsics.d(this.c, cardSectionAppModel.c);
    }

    public final int hashCode() {
        int iHashCode = this.f3719a.hashCode() * 31;
        IconType iconType = this.b;
        int iHashCode2 = (iHashCode + (iconType == null ? 0 : iconType.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardSectionAppModel(title=");
        sb.append(this.f3719a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", desc=");
        return vo1.p(sb, this.c, ")");
    }

    public CardSectionAppModel(IconType iconType, String str, String str2) {
        this.f3719a = str;
        this.b = iconType;
        this.c = str2;
    }
}
