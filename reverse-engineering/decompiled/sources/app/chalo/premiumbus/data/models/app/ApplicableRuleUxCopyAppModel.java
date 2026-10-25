package app.chalo.premiumbus.data.models.app;

import defpackage.dd;
import defpackage.nf1;
import defpackage.s5;
import defpackage.vo1;
import defpackage.xs;
import java.util.List;
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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel;", "", "Companion", "SlotScreen", "CheckoutScreen", "ProductScreen", "ChaloBusTab", "PassPurchaseConfirmationScreen", "PassPlanScreen", "Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel$ChaloBusTab;", "Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel$CheckoutScreen;", "Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel$PassPlanScreen;", "Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel$PassPurchaseConfirmationScreen;", "Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel$ProductScreen;", "Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel$SlotScreen;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class ApplicableRuleUxCopyAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f7072a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new s5(26));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<ApplicableRuleUxCopyAppModel> serializer() {
            return (KSerializer) ApplicableRuleUxCopyAppModel.f7072a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel$ChaloBusTab;", "Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ChaloBusTab extends ApplicableRuleUxCopyAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel$ChaloBusTab$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel$ChaloBusTab;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<ChaloBusTab> serializer() {
                return ApplicableRuleUxCopyAppModel$ChaloBusTab$$serializer.f7073a;
            }
        }

        public /* synthetic */ ChaloBusTab(int i, String str) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                PluginExceptionsKt.b(ApplicableRuleUxCopyAppModel$ChaloBusTab$$serializer.f7073a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChaloBusTab) && Intrinsics.d(this.b, ((ChaloBusTab) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("ChaloBusTab(couponCopy=", this.b, ")");
        }

        public ChaloBusTab(String str) {
            this.b = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel$PassPlanScreen;", "Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PassPlanScreen extends ApplicableRuleUxCopyAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel$PassPlanScreen$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel$PassPlanScreen;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PassPlanScreen> serializer() {
                return ApplicableRuleUxCopyAppModel$PassPlanScreen$$serializer.f7075a;
            }
        }

        public /* synthetic */ PassPlanScreen(int i, String str) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                PluginExceptionsKt.b(ApplicableRuleUxCopyAppModel$PassPlanScreen$$serializer.f7075a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PassPlanScreen) && Intrinsics.d(this.b, ((PassPlanScreen) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("PassPlanScreen(couponCopy=", this.b, ")");
        }

        public PassPlanScreen(String str) {
            this.b = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel$ProductScreen;", "Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ProductScreen extends ApplicableRuleUxCopyAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel$ProductScreen$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel$ProductScreen;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<ProductScreen> serializer() {
                return ApplicableRuleUxCopyAppModel$ProductScreen$$serializer.f7077a;
            }
        }

        public /* synthetic */ ProductScreen(int i, String str) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                PluginExceptionsKt.b(ApplicableRuleUxCopyAppModel$ProductScreen$$serializer.f7077a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProductScreen) && Intrinsics.d(this.b, ((ProductScreen) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("ProductScreen(couponCopy=", this.b, ")");
        }

        public ProductScreen(String str) {
            this.b = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel$SlotScreen;", "Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class SlotScreen extends ApplicableRuleUxCopyAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel$SlotScreen$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel$SlotScreen;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<SlotScreen> serializer() {
                return ApplicableRuleUxCopyAppModel$SlotScreen$$serializer.f7078a;
            }
        }

        public /* synthetic */ SlotScreen(int i, String str) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                PluginExceptionsKt.b(ApplicableRuleUxCopyAppModel$SlotScreen$$serializer.f7078a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SlotScreen) && Intrinsics.d(this.b, ((SlotScreen) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("SlotScreen(couponCopy=", this.b, ")");
        }

        public SlotScreen(String str) {
            this.b = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel$CheckoutScreen;", "Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class CheckoutScreen extends ApplicableRuleUxCopyAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] e = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new s5(27))};
        public final String b;
        public final String c;
        public final List d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel$CheckoutScreen$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel$CheckoutScreen;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<CheckoutScreen> serializer() {
                return ApplicableRuleUxCopyAppModel$CheckoutScreen$$serializer.f7074a;
            }
        }

        public CheckoutScreen(String str, String str2, List list) {
            this.b = str;
            this.c = str2;
            this.d = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckoutScreen)) {
                return false;
            }
            CheckoutScreen checkoutScreen = (CheckoutScreen) obj;
            return Intrinsics.d(this.b, checkoutScreen.b) && Intrinsics.d(this.c, checkoutScreen.c) && Intrinsics.d(this.d, checkoutScreen.d);
        }

        public final int hashCode() {
            int iE = nf1.e(this.b.hashCode() * 31, 31, this.c);
            List list = this.d;
            return iE + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            return xs.l(dd.e("CheckoutScreen(couponName=", this.b, ", couponOfferCopy=", this.c, ", termsAndConditions="), this.d, ")");
        }

        public /* synthetic */ CheckoutScreen(List list, int i, String str, String str2) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(ApplicableRuleUxCopyAppModel$CheckoutScreen$$serializer.f7074a.getDescriptor(), i, 7);
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = list;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel$PassPurchaseConfirmationScreen;", "Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PassPurchaseConfirmationScreen extends ApplicableRuleUxCopyAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] e = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new s5(28))};
        public final String b;
        public final String c;
        public final List d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel$PassPurchaseConfirmationScreen$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/app/ApplicableRuleUxCopyAppModel$PassPurchaseConfirmationScreen;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PassPurchaseConfirmationScreen> serializer() {
                return ApplicableRuleUxCopyAppModel$PassPurchaseConfirmationScreen$$serializer.f7076a;
            }
        }

        public PassPurchaseConfirmationScreen(String str, String str2, List list) {
            this.b = str;
            this.c = str2;
            this.d = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PassPurchaseConfirmationScreen)) {
                return false;
            }
            PassPurchaseConfirmationScreen passPurchaseConfirmationScreen = (PassPurchaseConfirmationScreen) obj;
            return Intrinsics.d(this.b, passPurchaseConfirmationScreen.b) && Intrinsics.d(this.c, passPurchaseConfirmationScreen.c) && Intrinsics.d(this.d, passPurchaseConfirmationScreen.d);
        }

        public final int hashCode() {
            int iE = nf1.e(this.b.hashCode() * 31, 31, this.c);
            List list = this.d;
            return iE + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            return xs.l(dd.e("PassPurchaseConfirmationScreen(couponName=", this.b, ", couponOfferCopy=", this.c, ", termsAndConditions="), this.d, ")");
        }

        public /* synthetic */ PassPurchaseConfirmationScreen(List list, int i, String str, String str2) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(ApplicableRuleUxCopyAppModel$PassPurchaseConfirmationScreen$$serializer.f7076a.getDescriptor(), i, 7);
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = list;
        }
    }
}
