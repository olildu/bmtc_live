package app.chalo.juspay;

import defpackage.cb0;
import defpackage.dd;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/SelectedAccount;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SelectedAccount {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4090a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/SelectedAccount$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/SelectedAccount;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SelectedAccount> serializer() {
            return SelectedAccount$$serializer.f4091a;
        }
    }

    public /* synthetic */ SelectedAccount(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(SelectedAccount$$serializer.f4091a.getDescriptor(), i, 127);
            throw null;
        }
        this.f4090a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedAccount)) {
            return false;
        }
        SelectedAccount selectedAccount = (SelectedAccount) obj;
        return Intrinsics.d(this.f4090a, selectedAccount.f4090a) && Intrinsics.d(this.b, selectedAccount.b) && Intrinsics.d(this.c, selectedAccount.c) && Intrinsics.d(this.d, selectedAccount.d) && Intrinsics.d(this.e, selectedAccount.e) && Intrinsics.d(this.f, selectedAccount.f) && Intrinsics.d(this.g, selectedAccount.g);
    }

    public final int hashCode() {
        String str = this.f4090a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SelectedAccount(bankCode=", this.f4090a, ", bankName=", this.b, ", ifsc=");
        cb0.t(sbE, this.c, ", isPrimary=", this.d, ", maskedAccountNumber=");
        cb0.t(sbE, this.e, ", mpinSet=", this.f, ", referenceId=");
        return vo1.p(sbE, this.g, ")");
    }
}
