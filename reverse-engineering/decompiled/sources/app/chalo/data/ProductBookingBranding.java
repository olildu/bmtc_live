package app.chalo.data;

import app.chalo.providers.iconassetprovider.IconType;
import defpackage.pw0;
import defpackage.vo1;
import java.util.Locale;
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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lapp/chalo/data/ProductBookingBranding;", "", "Companion", "None", "Ondc", "AppResource", "AgencyBrandingResource", "AgencyBrandingText", "AgencyBranding", "Lapp/chalo/data/ProductBookingBranding$AgencyBranding;", "Lapp/chalo/data/ProductBookingBranding$AgencyBrandingResource;", "Lapp/chalo/data/ProductBookingBranding$AgencyBrandingText;", "Lapp/chalo/data/ProductBookingBranding$AppResource;", "Lapp/chalo/data/ProductBookingBranding$None;", "Lapp/chalo/data/ProductBookingBranding$Ondc;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class ProductBookingBranding {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f2388a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new pw0(13));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/ProductBookingBranding$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/ProductBookingBranding;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static ProductBookingBranding a(String city, String agency) {
            Intrinsics.i(city, "city");
            Intrinsics.i(agency, "agency");
            Locale locale = Locale.ROOT;
            String lowerCase = city.toLowerCase(locale);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            if (lowerCase.equals("bhopal")) {
                String lowerCase2 = agency.toLowerCase(locale);
                Intrinsics.h(lowerCase2, "toLowerCase(...)");
                if (lowerCase2.equals("bcll")) {
                    return new AppResource(IconType.IC_BHOPAL_BCLL_LOGO);
                }
            }
            String lowerCase3 = city.toLowerCase(locale);
            Intrinsics.h(lowerCase3, "toLowerCase(...)");
            if (lowerCase3.equals("bengaluru")) {
                String lowerCase4 = agency.toLowerCase(locale);
                Intrinsics.h(lowerCase4, "toLowerCase(...)");
                if (lowerCase4.equals("bmtc")) {
                    return new AgencyBrandingResource(IconType.IC_BMTC_LOGO);
                }
            }
            String lowerCase5 = city.toLowerCase(locale);
            Intrinsics.h(lowerCase5, "toLowerCase(...)");
            if (lowerCase5.equals("gurugram")) {
                String lowerCase6 = agency.toLowerCase(locale);
                Intrinsics.h(lowerCase6, "toLowerCase(...)");
                if (lowerCase6.equals("gmcbl")) {
                    return new AgencyBrandingResource(IconType.IC_GMCBL_BRANDING_LOGO);
                }
            }
            return None.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<ProductBookingBranding> serializer() {
            return (KSerializer) ProductBookingBranding.f2388a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/data/ProductBookingBranding$None;", "Lapp/chalo/data/ProductBookingBranding;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final class None extends ProductBookingBranding {
        public static final None INSTANCE = new None();
        public static final /* synthetic */ Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new pw0(16));

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<None> serializer() {
            return (KSerializer) b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/ProductBookingBranding$AgencyBranding;", "Lapp/chalo/data/ProductBookingBranding;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class AgencyBranding extends ProductBookingBranding {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/ProductBookingBranding$AgencyBranding$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/ProductBookingBranding$AgencyBranding;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<AgencyBranding> serializer() {
                return ProductBookingBranding$AgencyBranding$$serializer.f2389a;
            }
        }

        public /* synthetic */ AgencyBranding(int i, String str) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                PluginExceptionsKt.b(ProductBookingBranding$AgencyBranding$$serializer.f2389a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AgencyBranding) && Intrinsics.d(this.b, ((AgencyBranding) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("AgencyBranding(url=", this.b, ")");
        }

        public AgencyBranding(String url) {
            Intrinsics.i(url, "url");
            this.b = url;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/ProductBookingBranding$AgencyBrandingResource;", "Lapp/chalo/data/ProductBookingBranding;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class AgencyBrandingResource extends ProductBookingBranding {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] c = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new pw0(14))};
        public final IconType b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/ProductBookingBranding$AgencyBrandingResource$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/ProductBookingBranding$AgencyBrandingResource;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<AgencyBrandingResource> serializer() {
                return ProductBookingBranding$AgencyBrandingResource$$serializer.f2390a;
            }
        }

        public /* synthetic */ AgencyBrandingResource(int i, IconType iconType) {
            if (1 == (i & 1)) {
                this.b = iconType;
            } else {
                PluginExceptionsKt.b(ProductBookingBranding$AgencyBrandingResource$$serializer.f2390a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AgencyBrandingResource) && this.b == ((AgencyBrandingResource) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "AgencyBrandingResource(icon=" + this.b + ")";
        }

        public AgencyBrandingResource(IconType icon) {
            Intrinsics.i(icon, "icon");
            this.b = icon;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/ProductBookingBranding$AgencyBrandingText;", "Lapp/chalo/data/ProductBookingBranding;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class AgencyBrandingText extends ProductBookingBranding {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/ProductBookingBranding$AgencyBrandingText$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/ProductBookingBranding$AgencyBrandingText;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<AgencyBrandingText> serializer() {
                return ProductBookingBranding$AgencyBrandingText$$serializer.f2391a;
            }
        }

        public /* synthetic */ AgencyBrandingText(int i, String str) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                PluginExceptionsKt.b(ProductBookingBranding$AgencyBrandingText$$serializer.f2391a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AgencyBrandingText) && Intrinsics.d(this.b, ((AgencyBrandingText) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("AgencyBrandingText(agency=", this.b, ")");
        }

        public AgencyBrandingText(String str) {
            this.b = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/ProductBookingBranding$AppResource;", "Lapp/chalo/data/ProductBookingBranding;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class AppResource extends ProductBookingBranding {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] c = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new pw0(15))};
        public final IconType b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/ProductBookingBranding$AppResource$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/ProductBookingBranding$AppResource;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<AppResource> serializer() {
                return ProductBookingBranding$AppResource$$serializer.f2392a;
            }
        }

        public /* synthetic */ AppResource(int i, IconType iconType) {
            if ((i & 1) == 0) {
                this.b = IconType.ONDC_LOGO;
            } else {
                this.b = iconType;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AppResource) && this.b == ((AppResource) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "AppResource(icon=" + this.b + ")";
        }

        public AppResource(IconType icon) {
            Intrinsics.i(icon, "icon");
            this.b = icon;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/ProductBookingBranding$Ondc;", "Lapp/chalo/data/ProductBookingBranding;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Ondc extends ProductBookingBranding {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] c = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new pw0(17))};
        public final IconType b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/ProductBookingBranding$Ondc$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/ProductBookingBranding$Ondc;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Ondc> serializer() {
                return ProductBookingBranding$Ondc$$serializer.f2393a;
            }
        }

        public /* synthetic */ Ondc(int i, IconType iconType) {
            if ((i & 1) == 0) {
                this.b = IconType.ONDC_LOGO;
            } else {
                this.b = iconType;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ondc) && this.b == ((Ondc) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Ondc(icon=" + this.b + ")";
        }

        public Ondc() {
            IconType icon = IconType.ONDC_LOGO;
            Intrinsics.i(icon, "icon");
            this.b = icon;
        }
    }
}
