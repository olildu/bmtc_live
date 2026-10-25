package app.chalo.home.domain;

import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.recent.model.app.RecentLocationPairEndpointAppModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/GetRecentSearchListUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetRecentSearchListUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f3049a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3050a;

        static {
            int[] iArr = new int[RouteNamingSchemeType.values().length];
            try {
                iArr[RouteNamingSchemeType.VIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteNamingSchemeType.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3050a = iArr;
        }
    }

    public GetRecentSearchListUseCase(StringProvider stringProvider) {
        this.f3049a = stringProvider;
    }

    public static String a(RecentLocationPairEndpointAppModel recentLocationPairEndpointAppModel) {
        if (recentLocationPairEndpointAppModel instanceof RecentLocationPairEndpointAppModel.NearbyStopToPlace) {
            return ((RecentLocationPairEndpointAppModel.NearbyStopToPlace) recentLocationPairEndpointAppModel).b.b;
        }
        if (recentLocationPairEndpointAppModel instanceof RecentLocationPairEndpointAppModel.Place) {
            return b(((RecentLocationPairEndpointAppModel.Place) recentLocationPairEndpointAppModel).b.i);
        }
        if (recentLocationPairEndpointAppModel instanceof RecentLocationPairEndpointAppModel.Stop) {
            return ((RecentLocationPairEndpointAppModel.Stop) recentLocationPairEndpointAppModel).b.b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static String b(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        int iD = StringsKt.D(str, ",", 0, false, 6);
        if (iD == -1) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.k(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            return str.subSequence(i, length + 1).toString();
        }
        String strSubstring = str.substring(0, iD);
        Intrinsics.h(strSubstring, "substring(...)");
        int length2 = strSubstring.length() - 1;
        int i2 = 0;
        boolean z3 = false;
        while (i2 <= length2) {
            boolean z4 = Intrinsics.k(strSubstring.charAt(!z3 ? i2 : length2), 32) <= 0;
            if (z3) {
                if (!z4) {
                    break;
                }
                length2--;
            } else if (z4) {
                i2++;
            } else {
                z3 = true;
            }
        }
        return strSubstring.subSequence(i2, length2 + 1).toString();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0094  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:25:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:37:0x0100  */
    /* JADX WARN: Code duplicated, block: B:47:0x0114  */
    /* JADX WARN: Code duplicated, block: B:50:0x012c  */
    /* JADX WARN: Code duplicated, block: B:52:0x013b  */
    /* JADX WARN: Code duplicated, block: B:54:0x013f  */
    /* JADX WARN: Code duplicated, block: B:55:0x014b  */
    /* JADX WARN: Code duplicated, block: B:57:0x014f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0164 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0166  */
    /* JADX WARN: Code duplicated, block: B:61:0x0171  */
    /* JADX WARN: Code duplicated, block: B:63:0x0177  */
    /* JADX WARN: Code duplicated, block: B:64:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x018b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0194  */
    /* JADX WARN: Code duplicated, block: B:71:0x019a  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c7 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b4, code lost:
    
        if (r1 == r3) goto L81;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01b4 -> B:82:0x01b7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r18, java.util.List r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.domain.GetRecentSearchListUseCase.c(java.util.List, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
