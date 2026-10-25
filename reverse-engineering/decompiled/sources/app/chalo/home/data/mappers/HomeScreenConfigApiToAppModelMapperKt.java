package app.chalo.home.data.mappers;

import app.chalo.data.BackgroundAppModel;
import app.chalo.data.BackgroundStyle;
import app.chalo.data.ChaloTextDataAppModel;
import app.chalo.data.PaddingAppModel;
import app.chalo.data.TextFormatAppModel;
import app.chalo.data.TextStyleAppModel;
import app.chalo.home.data.model.api.BackgroundApiModel;
import app.chalo.home.data.model.api.ChaloBusHeaderApiModel;
import app.chalo.home.data.model.api.ChaloTextDataApiModel;
import app.chalo.home.data.model.api.FAQApiModel;
import app.chalo.home.data.model.api.ItemTextDataApiModel;
import app.chalo.home.data.model.api.PaddingApiModel;
import app.chalo.home.data.model.api.PassSectionItemDataApiModel;
import app.chalo.home.data.model.api.SearchCardApiModel;
import app.chalo.home.data.model.api.SectionApiModel;
import app.chalo.home.data.model.api.SectionItemApiModel;
import app.chalo.home.data.model.api.TabMetaDataApiModel;
import app.chalo.home.data.model.api.TextStyleApiModel;
import app.chalo.homescreen.data.model.app.BgHighlightType;
import app.chalo.homescreen.data.model.app.BottomNavTabType;
import app.chalo.homescreen.data.model.app.CardSectionAppModel;
import app.chalo.homescreen.data.model.app.ChaloBusHeaderAppModel;
import app.chalo.homescreen.data.model.app.ChaloBusPageSectionType;
import app.chalo.homescreen.data.model.app.FAQAppModel;
import app.chalo.homescreen.data.model.app.GamBannerAdSectionAppModel;
import app.chalo.homescreen.data.model.app.HeaderItemType;
import app.chalo.homescreen.data.model.app.HomePageSectionType;
import app.chalo.homescreen.data.model.app.ImageResourceCtaType;
import app.chalo.homescreen.data.model.app.ImageResourcePlacement;
import app.chalo.homescreen.data.model.app.ImageResourceSectionAppModel;
import app.chalo.homescreen.data.model.app.ItemTextDataAppModel;
import app.chalo.homescreen.data.model.app.PassCardDataAppModel;
import app.chalo.homescreen.data.model.app.PlotlineWidgetSectionAppModel;
import app.chalo.homescreen.data.model.app.RegularBusPageFeature;
import app.chalo.homescreen.data.model.app.RegularBusPageSectionType;
import app.chalo.homescreen.data.model.app.SearchCardAppModel;
import app.chalo.homescreen.data.model.app.SectionAppModel;
import app.chalo.homescreen.data.model.app.SectionItemAppModel;
import app.chalo.homescreen.data.model.app.TabMetaDataAppModel;
import app.chalo.homescreen.data.model.app.TicketsPageSectionType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.iconassetprovider.IconTypeUtils;
import app.chalo.utils.CommonHtmlParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HomeScreenConfigApiToAppModelMapperKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2873a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;
        public static final /* synthetic */ int[] f;

        static {
            int[] iArr = new int[BottomNavTabType.values().length];
            try {
                iArr[BottomNavTabType.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BottomNavTabType.REGULAR_BUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BottomNavTabType.CHALO_BUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BottomNavTabType.MY_TICKETS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BottomNavTabType.SEARCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BottomNavTabType.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f2873a = iArr;
            int[] iArr2 = new int[HomePageSectionType.values().length];
            try {
                iArr2[HomePageSectionType.HOME_TAB_HOOKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[HomePageSectionType.TICKETS_PASSES.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[HomePageSectionType.PLOTLINE_WIDGET.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[HomePageSectionType.FOOTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[HomePageSectionType.GAM_BANNER_AD.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[HomePageSectionType.ADSTER_UNIFIED_AD.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[HomePageSectionType.IMAGE_RESOURCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[HomePageSectionType.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            b = iArr2;
            int[] iArr3 = new int[RegularBusPageSectionType.values().length];
            try {
                iArr3[RegularBusPageSectionType.NEARBY_BUS_STOPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[RegularBusPageSectionType.NEARBY_BUSES.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[RegularBusPageSectionType.TICKETS_PASSES.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[RegularBusPageSectionType.PLOTLINE_WIDGET.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[RegularBusPageSectionType.FAQ.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[RegularBusPageSectionType.PRODUCT_PURCHASE.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[RegularBusPageSectionType.FOOTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[RegularBusPageSectionType.DIVIDER.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[RegularBusPageSectionType.GAM_BANNER_AD.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[RegularBusPageSectionType.REGULAR_BUS_UNIFIED_AD.ordinal()] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[RegularBusPageSectionType.IMAGE_RESOURCE.ordinal()] = 11;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[RegularBusPageSectionType.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused26) {
            }
            c = iArr3;
            int[] iArr4 = new int[RegularBusPageFeature.values().length];
            try {
                iArr4[RegularBusPageFeature.PAY_FOR_TICKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr4[RegularBusPageFeature.CHALO_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr4[RegularBusPageFeature.METRO.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr4[RegularBusPageFeature.IMAGE_RESOURCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr4[RegularBusPageFeature.PASSES.ordinal()] = 5;
            } catch (NoSuchFieldError unused31) {
            }
            d = iArr4;
            int[] iArr5 = new int[TicketsPageSectionType.values().length];
            try {
                iArr5[TicketsPageSectionType.TICKETS_TAB_HOOKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr5[TicketsPageSectionType.PRODUCT_PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr5[TicketsPageSectionType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused34) {
            }
            e = iArr5;
            int[] iArr6 = new int[ChaloBusPageSectionType.values().length];
            try {
                iArr6[ChaloBusPageSectionType.CUSTOMER_SUPPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr6[ChaloBusPageSectionType.TICKETS_PASSES.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr6[ChaloBusPageSectionType.PLOTLINE_WIDGET.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr6[ChaloBusPageSectionType.PRODUCT_PURCHASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr6[ChaloBusPageSectionType.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr6[ChaloBusPageSectionType.PASS_PURCHASE.ordinal()] = 6;
            } catch (NoSuchFieldError unused40) {
            }
            f = iArr6;
        }
    }

    public static final CardSectionAppModel a(SectionAppModel sectionAppModel) {
        String str = sectionAppModel.i;
        if (str == null) {
            str = "";
        }
        return new CardSectionAppModel(sectionAppModel.o, str, sectionAppModel.d);
    }

    public static final ChaloTextDataAppModel b(ChaloTextDataApiModel chaloTextDataApiModel, CommonHtmlParser commonHtmlParser) {
        BackgroundAppModel backgroundAppModel;
        TextStyleAppModel textStyleAppModel;
        BackgroundStyle next;
        PaddingAppModel paddingAppModel;
        BackgroundApiModel backgroundApiModel = chaloTextDataApiModel.f2882a;
        String str = "#00000000";
        if (backgroundApiModel != null) {
            String str2 = backgroundApiModel.f2876a;
            if (str2 == null || str2.length() == 0) {
                str2 = "#00000000";
            }
            BackgroundStyle.Companion companion = BackgroundStyle.INSTANCE;
            String str3 = backgroundApiModel.b;
            if (str3 == null) {
                str3 = "";
            }
            companion.getClass();
            Iterator<BackgroundStyle> it = BackgroundStyle.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt.x(next.bgStyle, str3, true));
            BackgroundStyle backgroundStyle = next;
            if (backgroundStyle == null) {
                backgroundStyle = BackgroundStyle.UNKNOWN;
            }
            PaddingApiModel paddingApiModel = backgroundApiModel.c;
            if (paddingApiModel != null) {
                Integer num = paddingApiModel.f2894a;
                int iIntValue = num != null ? num.intValue() : 0;
                Integer num2 = paddingApiModel.c;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                Integer num3 = paddingApiModel.b;
                int iIntValue3 = num3 != null ? num3.intValue() : 0;
                Integer num4 = paddingApiModel.d;
                paddingAppModel = new PaddingAppModel(iIntValue, iIntValue3, iIntValue2, num4 != null ? num4.intValue() : 0);
            } else {
                paddingAppModel = new PaddingAppModel(0, 0, 0, 0);
            }
            backgroundAppModel = new BackgroundAppModel(str2, backgroundStyle, paddingAppModel);
        } else {
            backgroundAppModel = new BackgroundAppModel();
        }
        BackgroundAppModel backgroundAppModel2 = backgroundAppModel;
        String str4 = chaloTextDataApiModel.b;
        if (str4 == null) {
            str4 = " ";
        }
        IconType iconTypeA = IconTypeUtils.a(str4);
        String str5 = chaloTextDataApiModel.d;
        IconType iconTypeA2 = IconTypeUtils.a(str5 != null ? str5 : " ");
        TextStyleApiModel textStyleApiModel = chaloTextDataApiModel.f;
        if (textStyleApiModel != null) {
            String str6 = textStyleApiModel.f2908a;
            String str7 = textStyleApiModel.b;
            List listA = commonHtmlParser.a(str6 == null ? "" : str6);
            TextFormatAppModel.HtmlFormatted htmlFormatted = new TextFormatAppModel.HtmlFormatted(listA, str6 != null ? str6 : "");
            if (str7 != null && str7.length() != 0) {
                str = str7;
            }
            Integer num5 = textStyleApiModel.c;
            textStyleAppModel = new TextStyleAppModel(htmlFormatted, str, num5 != null ? num5.intValue() : 0, listA);
        } else {
            textStyleAppModel = new TextStyleAppModel();
        }
        TextStyleAppModel textStyleAppModel2 = textStyleAppModel;
        Integer num6 = chaloTextDataApiModel.c;
        int iIntValue4 = num6 != null ? num6.intValue() : 0;
        Integer num7 = chaloTextDataApiModel.e;
        return new ChaloTextDataAppModel(backgroundAppModel2, iconTypeA, iIntValue4, iconTypeA2, num7 != null ? num7.intValue() : 0, textStyleAppModel2);
    }

    public static final GamBannerAdSectionAppModel c(SectionAppModel sectionAppModel) {
        String str = sectionAppModel.i;
        if (str == null) {
            str = "";
        }
        String str2 = sectionAppModel.e;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = sectionAppModel.d;
        String str4 = str3 != null ? str3 : "";
        Integer num = sectionAppModel.p;
        return new GamBannerAdSectionAppModel(str, str2, str4, num != null ? num.intValue() : 250);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    public static final TabMetaDataAppModel d(TabMetaDataApiModel tabMetaDataApiModel, CommonHtmlParser commonHtmlParser) {
        TextFormatAppModel simple;
        String str;
        BgHighlightType next;
        String str2;
        List list;
        String str3;
        String str4;
        ?? arrayList;
        SearchCardAppModel searchCardAppModel;
        List list2;
        String str5;
        HeaderItemType headerItemType;
        String str6;
        ChaloBusHeaderApiModel chaloBusHeaderApiModel = tabMetaDataApiModel.i;
        String str7 = "";
        if (chaloBusHeaderApiModel == null || (str6 = chaloBusHeaderApiModel.b) == null) {
            if (chaloBusHeaderApiModel == null || (str = chaloBusHeaderApiModel.b) == null) {
                str = "";
            }
            simple = new TextFormatAppModel.Simple(str);
        } else {
            simple = new TextFormatAppModel.HtmlFormatted(commonHtmlParser.a(str6), str6);
        }
        BgHighlightType.Companion companion = BgHighlightType.INSTANCE;
        String str8 = tabMetaDataApiModel.f2906a;
        if (str8 == null) {
            str8 = "";
        }
        companion.getClass();
        Iterator<BgHighlightType> it = BgHighlightType.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(next.getBgType(), str8));
        BgHighlightType bgHighlightType = next;
        if (bgHighlightType == null) {
            bgHighlightType = BgHighlightType.UNKNOWN;
        }
        BgHighlightType bgHighlightType2 = bgHighlightType;
        String str9 = tabMetaDataApiModel.b;
        String str10 = tabMetaDataApiModel.e;
        if (str10 == null) {
            str10 = "";
        }
        IconType iconTypeA = IconTypeUtils.a(str10);
        String str11 = tabMetaDataApiModel.g;
        String str12 = str11 == null ? "" : str11;
        String str13 = tabMetaDataApiModel.h;
        String str14 = str13 == null ? "" : str13;
        String str15 = tabMetaDataApiModel.j;
        String str16 = str15 == null ? "" : str15;
        List list3 = tabMetaDataApiModel.f;
        if (list3 != null) {
            List<String> list4 = list3;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list4, 10));
            for (String headerType : list4) {
                HeaderItemType.INSTANCE.getClass();
                Intrinsics.i(headerType, "headerType");
                HeaderItemType[] headerItemTypeArrValues = HeaderItemType.values();
                int length = headerItemTypeArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        str5 = str7;
                        headerItemType = null;
                        break;
                    }
                    headerItemType = headerItemTypeArrValues[i];
                    str5 = str7;
                    if (Intrinsics.d(headerItemType.getHeaderType(), headerType)) {
                        break;
                    }
                    i++;
                    str7 = str5;
                }
                if (headerItemType == null) {
                    headerItemType = HeaderItemType.UNKNOWN;
                }
                arrayList2.add(headerItemType);
                str7 = str5;
            }
            str2 = str7;
            list = arrayList2;
        } else {
            str2 = "";
            list = EmptyList.f17557a;
        }
        List list5 = list;
        if (chaloBusHeaderApiModel == null || (str3 = chaloBusHeaderApiModel.f2880a) == null) {
            str3 = str2;
        }
        IconType iconTypeA2 = IconTypeUtils.a(str3);
        if (chaloBusHeaderApiModel == null || (str4 = chaloBusHeaderApiModel.d) == null) {
            str4 = str2;
        }
        if (chaloBusHeaderApiModel == null || (list2 = chaloBusHeaderApiModel.c) == null) {
            arrayList = EmptyList.f17557a;
        } else {
            List list6 = list2;
            arrayList = new ArrayList(CollectionsKt.v(list6, 10));
            Iterator it2 = list6.iterator();
            while (it2.hasNext()) {
                arrayList.add(b((ChaloTextDataApiModel) it2.next(), commonHtmlParser));
            }
        }
        ChaloBusHeaderAppModel chaloBusHeaderAppModel = new ChaloBusHeaderAppModel(iconTypeA2, simple, arrayList, str4);
        String str17 = tabMetaDataApiModel.k;
        Integer num = tabMetaDataApiModel.l;
        String str18 = tabMetaDataApiModel.m;
        String str19 = tabMetaDataApiModel.n;
        Integer num2 = tabMetaDataApiModel.o;
        String str20 = tabMetaDataApiModel.p;
        String str21 = tabMetaDataApiModel.q;
        SearchCardApiModel searchCardApiModel = tabMetaDataApiModel.r;
        if (searchCardApiModel != null) {
            String str22 = searchCardApiModel.f2900a;
            if (str22 == null) {
                str22 = str2;
            }
            String str23 = searchCardApiModel.b;
            if (str23 == null) {
                str23 = str2;
            }
            String str24 = searchCardApiModel.c;
            if (str24 == null) {
                str24 = str2;
            }
            searchCardAppModel = new SearchCardAppModel(str22, str23, str24, searchCardApiModel.d);
        } else {
            searchCardAppModel = null;
        }
        return new TabMetaDataAppModel(bgHighlightType2, str9, iconTypeA, list5, str12, str14, str16, chaloBusHeaderAppModel, str17, num, str18, str19, num2, str20, str21, searchCardAppModel);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static final app.chalo.homescreen.data.model.app.HomeScreenConfigAppModel e(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r56v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public static final ImageResourceSectionAppModel f(SectionAppModel sectionAppModel) {
        String str = sectionAppModel.q;
        ImageResourcePlacement imageResourcePlacement = null;
        if (str != null) {
            String str2 = !StringsKt.F(str) ? str : null;
            if (str2 != null) {
                Integer num = sectionAppModel.r;
                int iIntValue = num != null ? num.intValue() : 0;
                String str3 = sectionAppModel.u;
                ImageResourcePlacement.Companion companion = ImageResourcePlacement.INSTANCE;
                String str4 = sectionAppModel.s;
                companion.getClass();
                for (ImageResourcePlacement imageResourcePlacement2 : ImageResourcePlacement.getEntries()) {
                    if (Intrinsics.d(imageResourcePlacement2.getValue(), str4)) {
                        imageResourcePlacement = imageResourcePlacement2;
                        break;
                    }
                }
                ImageResourcePlacement imageResourcePlacement3 = imageResourcePlacement;
                if (imageResourcePlacement3 == null) {
                    imageResourcePlacement3 = ImageResourcePlacement.BELOW_HEADER;
                }
                ImageResourcePlacement imageResourcePlacement4 = imageResourcePlacement3;
                Boolean bool = sectionAppModel.t;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                ImageResourceCtaType.Companion companion2 = ImageResourceCtaType.INSTANCE;
                String str5 = sectionAppModel.v;
                companion2.getClass();
                return new ImageResourceSectionAppModel(str2, iIntValue, str3, imageResourcePlacement4, zBooleanValue, ImageResourceCtaType.Companion.a(str5), sectionAppModel.i, (IconType) null, 128);
            }
        }
        return null;
    }

    public static final ItemTextDataAppModel g(ItemTextDataApiModel itemTextDataApiModel, CommonHtmlParser commonHtmlParser) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List list = itemTextDataApiModel.f2890a;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(b((ChaloTextDataApiModel) it.next(), commonHtmlParser));
            }
        } else {
            arrayList = null;
        }
        List list3 = itemTextDataApiModel.b;
        if (list3 != null) {
            List list4 = list3;
            arrayList2 = new ArrayList(CollectionsKt.v(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(b((ChaloTextDataApiModel) it2.next(), commonHtmlParser));
            }
        } else {
            arrayList2 = null;
        }
        ChaloTextDataApiModel chaloTextDataApiModel = itemTextDataApiModel.c;
        return new ItemTextDataAppModel(arrayList, arrayList2, chaloTextDataApiModel != null ? b(chaloTextDataApiModel, commonHtmlParser) : null);
    }

    public static final PlotlineWidgetSectionAppModel h(SectionAppModel sectionAppModel) {
        String str = sectionAppModel.i;
        if (str == null) {
            str = "";
        }
        String str2 = sectionAppModel.e;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = sectionAppModel.d;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = sectionAppModel.b;
        return new PlotlineWidgetSectionAppModel(str, str2, str3, str4 != null ? str4 : "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.ArrayList] */
    public static final ArrayList i(List list, CommonHtmlParser commonHtmlParser) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ?? arrayList3;
        List list2 = list;
        int i = 10;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            SectionApiModel sectionApiModel = (SectionApiModel) it.next();
            List list3 = sectionApiModel.e;
            if (list3 != null) {
                List<FAQApiModel> list4 = list3;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.v(list4, i));
                for (FAQApiModel fAQApiModel : list4) {
                    arrayList5.add(new FAQAppModel(fAQApiModel.f2884a, fAQApiModel.b));
                }
                arrayList = arrayList5;
            } else {
                arrayList = null;
            }
            String str = sectionApiModel.b;
            String str2 = sectionApiModel.h;
            String str3 = sectionApiModel.g;
            String str4 = sectionApiModel.c;
            String str5 = sectionApiModel.f2902a;
            List list5 = sectionApiModel.j;
            if (list5 != null) {
                List<SectionItemApiModel> list6 = list5;
                ArrayList arrayList6 = new ArrayList(CollectionsKt.v(list6, i));
                for (SectionItemApiModel sectionItemApiModel : list6) {
                    String str6 = sectionItemApiModel.f2904a;
                    String str7 = sectionItemApiModel.b;
                    Iterator it2 = it;
                    int i2 = sectionItemApiModel.c;
                    String str8 = sectionItemApiModel.g;
                    ItemTextDataApiModel itemTextDataApiModel = sectionItemApiModel.d;
                    ItemTextDataAppModel itemTextDataAppModelG = itemTextDataApiModel != null ? g(itemTextDataApiModel, commonHtmlParser) : null;
                    String str9 = sectionItemApiModel.e;
                    String str10 = sectionItemApiModel.f;
                    String str11 = sectionItemApiModel.h;
                    String str12 = sectionItemApiModel.i;
                    List list7 = sectionItemApiModel.j;
                    if (list7 != null) {
                        List list8 = list7;
                        arrayList3 = new ArrayList(CollectionsKt.v(list8, 10));
                        Iterator it3 = list8.iterator();
                        while (it3.hasNext()) {
                            PassSectionItemDataApiModel passSectionItemDataApiModel = (PassSectionItemDataApiModel) it3.next();
                            String str13 = passSectionItemDataApiModel.b;
                            Iterator it4 = it3;
                            String str14 = passSectionItemDataApiModel.c;
                            ItemTextDataApiModel itemTextDataApiModel2 = passSectionItemDataApiModel.e;
                            ItemTextDataAppModel itemTextDataAppModelG2 = itemTextDataApiModel2 != null ? g(itemTextDataApiModel2, commonHtmlParser) : new ItemTextDataAppModel(null, null, null);
                            int i3 = passSectionItemDataApiModel.d;
                            String str15 = passSectionItemDataApiModel.f2896a;
                            String str16 = passSectionItemDataApiModel.f;
                            if (str16 == null) {
                                str16 = "";
                            }
                            arrayList3.add(new PassCardDataAppModel(str13, str14, i3, itemTextDataAppModelG2, str15, IconTypeUtils.a(str16)));
                            commonHtmlParser = commonHtmlParser;
                            it3 = it4;
                        }
                    } else {
                        arrayList3 = EmptyList.f17557a;
                    }
                    ?? r26 = arrayList3;
                    String str17 = sectionItemApiModel.k;
                    if (str17 == null) {
                        str17 = "";
                    }
                    IconType iconTypeA = IconTypeUtils.a(str17);
                    String str18 = sectionItemApiModel.l;
                    if (str18 == null) {
                        str18 = "";
                    }
                    IconType iconTypeA2 = IconTypeUtils.a(str18);
                    Boolean bool = sectionItemApiModel.m;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    String str19 = sectionItemApiModel.n;
                    String str20 = sectionItemApiModel.o;
                    Integer num = sectionItemApiModel.p;
                    arrayList6.add(new SectionItemAppModel(str6, str7, i2, itemTextDataAppModelG, str9, str10, str8, str11, str12, r26, iconTypeA, iconTypeA2, zBooleanValue, str19, str20, (num == null || num.intValue() < 0) ? null : num));
                    commonHtmlParser = commonHtmlParser;
                    str4 = str4;
                    it = it2;
                }
                arrayList2 = arrayList6;
            } else {
                arrayList2 = null;
            }
            Iterator it5 = it;
            String str21 = str4;
            int i4 = sectionApiModel.d;
            String str22 = sectionApiModel.f;
            String str23 = sectionApiModel.k;
            String str24 = sectionApiModel.l;
            Boolean bool2 = sectionApiModel.m;
            String str25 = sectionApiModel.i;
            String str26 = sectionApiModel.n;
            String str27 = sectionApiModel.o;
            IconType iconTypeA3 = IconTypeUtils.a(str27 != null ? str27 : "");
            Integer num2 = sectionApiModel.p;
            String str28 = sectionApiModel.q;
            Integer num3 = sectionApiModel.r;
            arrayList4.add(new SectionAppModel(arrayList, str, str2, str3, str21, str5, arrayList2, i4, str22, str25, str23, str24, bool2, str26, iconTypeA3, num2, str28, (num3 == null || num3.intValue() < 0) ? null : num3, sectionApiModel.s, sectionApiModel.t, sectionApiModel.u, sectionApiModel.v));
            it = it5;
            i = 10;
        }
        return arrayList4;
    }
}
