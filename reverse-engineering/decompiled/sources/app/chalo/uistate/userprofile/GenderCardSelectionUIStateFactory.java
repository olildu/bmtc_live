package app.chalo.uistate.userprofile;

import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.userprofile.Gender;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/userprofile/GenderCardSelectionUIStateFactory;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GenderCardSelectionUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f10124a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10125a;

        static {
            int[] iArr = new int[Gender.values().length];
            try {
                iArr[Gender.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gender.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Gender.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Gender.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f10125a = iArr;
        }
    }

    public GenderCardSelectionUIStateFactory(StringProvider stringProvider) {
        this.f10124a = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x010b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0114  */
    /* JADX WARN: Code duplicated, block: B:28:0x0116  */
    /* JADX WARN: Code duplicated, block: B:30:0x0119  */
    /* JADX WARN: Code duplicated, block: B:32:0x011e  */
    /* JADX WARN: Code duplicated, block: B:35:0x012b  */
    /* JADX WARN: Code duplicated, block: B:36:0x012e  */
    /* JADX WARN: Code duplicated, block: B:40:0x017f  */
    /* JADX WARN: Code duplicated, block: B:43:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:44:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:46:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:48:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:50:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:52:0x01db  */
    /* JADX WARN: Code duplicated, block: B:53:0x01de  */
    /* JADX WARN: Code duplicated, block: B:54:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x0208  */
    /* JADX WARN: Code duplicated, block: B:59:0x020e  */
    /* JADX WARN: Code duplicated, block: B:61:0x022c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x017f -> B:13:0x0061). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(app.chalo.userprofile.Gender r30, java.util.List r31, defpackage.wl1 r32, app.chalo.uistate.components.ProductGridContainerSpec r33, app.chalo.uistate.userprofile.GenderCardSpec r34, kotlin.coroutines.jvm.internal.ContinuationImpl r35) {
        /*
            Method dump skipped, instruction units count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.uistate.userprofile.GenderCardSelectionUIStateFactory.a(app.chalo.userprofile.Gender, java.util.List, wl1, app.chalo.uistate.components.ProductGridContainerSpec, app.chalo.uistate.userprofile.GenderCardSpec, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
